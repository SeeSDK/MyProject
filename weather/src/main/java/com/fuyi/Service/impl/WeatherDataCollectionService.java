package com.fuyi.Service.impl;
/**
 *Author fuyi
 *ClassName WeatherDataCollectionService
 *Description 根据城市ID同步天气数据
 *Param  cityId
 *Return
 *Date  2018/12/18 23:25
 */
public interface WeatherDataCollectionService {

    void syncDataByCityId(String CityId);
}
