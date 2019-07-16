package com.fuyi.weather.data.server.service;

import com.fuyi.weather.data.server.pojo.WeatherResponse;

/**
 * Author fuyi
 * ClassName WeatherDataService
 * Description
 * Param
 * Return
 * Date  2018/12/20 23:23
 */
public interface WeatherDataService {
    /**
     * Author fuyi
     * ClassName WeatherDataService
     * Description 根据城市ID查询天气数据
     * Param
     * Return
     * Date  2018/12/20 23:24
     */
    WeatherResponse getDataByCityId(String cityId);


    /**
     * Author fuyi
     * ClassName WeatherDataService
     * Description 根据城市名称查询天气数据
     * Param
     * Return
     * Date  2018/12/20 23:33
     */
    WeatherResponse getDataByCityName(String cityName);
}
