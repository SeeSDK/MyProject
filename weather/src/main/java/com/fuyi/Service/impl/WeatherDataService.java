package com.fuyi.Service.impl;

import com.fuyi.pojo.WeatherResponse;

/**
 *Author fuyi
 *ClassName WeatherDataService
 *Description 天气数据服务
 *Param
 *Return
 *Date  2018/11/19 23:23
 */
public interface WeatherDataService {
    /**
     *Author fuyi
     *ClassName WeatherDataService
     *Description 根据城市ID查询天气数据
     *Param  cutyId
     *Return
     *Date  2018/11/19 23:24
     */
    WeatherResponse getDataByCityId(String cityId);
    /**
     *Author fuyi
     *ClassName WeatherDataService
     *Description 根据城市名称查询天气数据
     *Param  cityName
     *Return
     *Date  2018/11/19 23:25
     */
    WeatherResponse getDataByCityName(String cityName);
    /**
     *Author fuyi
     *ClassName WeatherDataService
     *Description 根据城市ID同步天气数据
     *Param   cityId
     *Return
     *Date  2018/11/23 0:12
     */
    void syncDataByCityId(String cityId);

}
