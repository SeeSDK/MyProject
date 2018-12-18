package com.fuyi.SpringCloud.weather.service;


import com.fuyi.SpringCloud.weather.pojo.Weather;
import com.fuyi.SpringCloud.weather.pojo.WeatherResponse;
import com.fuyi.SpringCloud.weather.service.iml.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *Author fuyi
 *ClassName WeatherReportServiceImpl
 *Description 实现WeatherReportService接口
 *Param
 *Return
 *Date  2018/11/26 23:23
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private WeatherReportService weatherReportService;


    @Override
    public Weather getDataByCityId(String cityId){
        WeatherResponse result =weatherReportService.getDataByCityId(cityId);
        return result.getData();
    }

}
