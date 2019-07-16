package com.fuyi.SpringCloud.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuyi.SpringCloud.weather.pojo.WeatherResponse;
import com.fuyi.SpringCloud.weather.service.iml.WeatherDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


/**
 * Author fuyi
 * ClassName WeatherDataServiceImpl
 * Description 天气数据服务
 * Param
 * Return
 * Date  2018/11/19 23:29
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {
    private final static Logger log = LoggerFactory.getLogger(WeatherDataServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";
    private final Long TIME_OUT = 500L; //缓存超时时间

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String url = WEATHER_API + "?citykey=" + cityId;
        return this.doGetWeatherData(url);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String url = WEATHER_API + "?citykey=" + cityName;
        return this.doGetWeatherData(url);
    }

    @Override
    public void syncDataByCityId(String cityId) {
        log.info("------------>将天气信息存入redis");
        String url = WEATHER_API + "?citykey=" + cityId;
        this.saveWeatherData(url);
    }

    private void saveWeatherData(String url) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = url;
        String strBody = null;
//        getForEntity() 发送一个HTTP GET请求，返回的ResponseEntity包含了响应体所映射成的对象
//
//        getForObject() 发送一个HTTP GET请求，返回的请求体将映射为一个对象
//
//        postForEntity()
//        POST 数据到一个URL，返回包含一个对象的ResponseEntity，这个对象是从响应体中映射得
//                到的
//
//        postForObject() POST 数据到一个URL，返回根据响应体匹配形成的对象

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
    }

    private WeatherResponse doGetWeatherData(String url) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = url;   //将调用的url作为缓存的key
        String strBody = null;
        //先查缓存，若没有再查服务
        if (!this.stringRedisTemplate.hasKey(key)) {
            log.info("未找到 key" + key);
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            if (response.getStatusCodeValue() == 200) {
                strBody = response.getBody();
            }
            ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
        } else {
            log.info("找到key" + key + ",value=" + ops.get(key));
            strBody = ops.get(key);
        }

        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            log.error("JSON 反序列化异常！", e);
            e.printStackTrace();

        }

        return weather;
    }

}
