package com.fuyi.SpringCloud.weather.controller;

import com.fuyi.SpringCloud.weather.pojo.Weather;
import com.fuyi.SpringCloud.weather.pojo.WeatherResponse;
import com.fuyi.SpringCloud.weather.service.iml.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author fuyi
 * ClassName WeatherController
 * Description 天气API
 * Param
 * Return
 * Date  2018/11/19 23:51
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getReportBycityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }

}

