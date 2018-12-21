package com.fuyi.mas.weather.report.Service.Impl;

import com.fuyi.mas.weather.report.Service.WeatherReportService;
import com.fuyi.mas.weather.report.pojo.Forecast;
import com.fuyi.mas.weather.report.pojo.Weather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *Author fuyi
 *ClassName WeatherReportServiceImpl
 *Description WeatherReportService 实现类
 *Param
 *Return
 *Date  2018/12/21 23:01
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Override
    public Weather getDataByCityId(String cityId) {
        //TODO 改为由天气数据API微服务来提供数据
        Weather data = new Weather();
        data.setAqi("81");
        data.setCity("昆明");
        data.setGanmao("各项气象条件适宜，无明显降温过程，发生感冒概率较低！");
        data.setWendu("22");

        List<Forecast> forecastList = new ArrayList<>();

        Forecast forecast = new Forecast();
        forecast.setDate("29日星期天");
        forecast.setType("多云");
        forecast.setFengxiang("无持续风向");
        forecast.setHigh("高温15度");
        forecast.setLow("低温4度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("30日星期一");
        forecast.setType("多云");
        forecast.setFengxiang("西北风向");
        forecast.setHigh("高温17度");
        forecast.setLow("低温5度");
        forecastList.add(forecast);


        forecast = new Forecast();
        forecast.setDate("1日星期三");
        forecast.setType("多云");
        forecast.setFengxiang("南风");
        forecast.setHigh("高温13度");
        forecast.setLow("低温5度");
        forecastList.add(forecast);

        forecast = new Forecast();
        forecast.setDate("2日星期四");
        forecast.setType("多云");
        forecast.setFengxiang("南风");
        forecast.setHigh("高温13度");
        forecast.setLow("低温5度");
        forecastList.add(forecast);
        data.setForecast(forecastList);
        return data;
    }
}
