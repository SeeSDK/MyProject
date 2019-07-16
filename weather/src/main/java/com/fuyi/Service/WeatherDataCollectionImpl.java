package com.fuyi.Service;

import com.fuyi.Service.impl.WeatherDataCollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * Author fuyi
 * ClassName WeatherDataCollectionImpl
 * Description 天气数据采集服务。
 * Param
 * Return
 * Date  2018/12/18 23:28
 */
@Service
public class WeatherDataCollectionImpl implements WeatherDataCollectionService {
    public final static Logger log = LoggerFactory.getLogger(WeatherDataCollectionImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

    private final Long TIME_OUT = 18000L;  //缓存超时时间


    @Override
    public void syncDataByCityId(String CityId) {
        log.info("开始同步天气,城市ID：--------->" + CityId);
        String url = WEATHER_API + "?citykey=" + CityId;
        this.saveWeatherData(url);
        log.info("同步天气数据完成===========>");

    }

    private void saveWeatherData(String url) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = null;
        String strBody = null;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }
        ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);

    }
}
