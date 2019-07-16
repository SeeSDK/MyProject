package com.fuyi.weather.data.server.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fuyi.weather.data.server.pojo.WeatherResponse;
import com.fuyi.weather.data.server.service.WeatherDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Author fuyi
 * ClassName WeatherDataServiceImpl
 * Description 天气数据服务
 * Param
 * Return
 * Date  2018/12/20 23:40
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private final static Logger log = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private final String WEATHER_API = "http://www.wthrcdn.etouch.cn/weather_mini";

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String url = WEATHER_API + "?citykey=" + cityId;
        return this.doGetWeatherData(url);
    }


    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String url = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherData(url);
    }

    private WeatherResponse doGetWeatherData(String url) {

        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = url;
        String StrBody = null;
        //先查缓存，查不到抛异常
        if (!this.stringRedisTemplate.hasKey(key)) {
            log.error("不存在Key:" + key);
            throw new RuntimeException("没有相关天气信息By Throw Exception!");
        } else {
            log.info("存在相关Key:" + key + "Value===" + ops.get(key));
            StrBody = ops.get(key);
        }
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(StrBody, WeatherResponse.class);
        } catch (IOException e) {
            log.error("JSON 反序列化异常！", e);
            throw new RuntimeException("天气信息解析失败！");
        }
        return weather;
    }
}
