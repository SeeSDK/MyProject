package com.fuyi.mas.weather.report.Service;

import com.fuyi.mas.weather.report.pojo.Weather;

/**
 *Author fuyi
 *ClassName WeatherReportService
 *Description 根据城市ID查询天气信息
 *Param  cityID
 *Return
 *Date  2018/12/21 22:59
 */
public interface WeatherReportService {
    Weather getDataByCityId(String cityId);
}
