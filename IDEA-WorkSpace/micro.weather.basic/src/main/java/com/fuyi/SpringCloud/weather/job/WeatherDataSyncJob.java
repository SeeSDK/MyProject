package com.fuyi.SpringCloud.weather.job;

import com.fuyi.SpringCloud.weather.service.iml.CityDataService;
import com.fuyi.SpringCloud.weather.service.iml.WeatherDataService;
import com.fuyi.SpringCloud.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;


/**
 * Author fuyi
 * ClassName WeatherDataSyncJob
 * Description 天气同步数据任务
 * Param
 * Return
 * Date  2018/11/21 22:43
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    private final static Logger log = LoggerFactory.getLogger(WeatherDataSyncJob.class);
    @Autowired
    CityDataService cityDataServiceImpl;
    @Autowired
    WeatherDataService weatherDataServiceImpl;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("开始天气数据同步任务");
        log.info("---------->开始读取城市列表");
        List<City> cityList = null;
        try {
            cityList = cityDataServiceImpl.listCity();
        } catch (Exception e) {
            log.error("获取城市信息失败", e);
        }
        for (City city : cityList) {
            String cityId = city.getCityId();
            log.info("-------->天气数据同步中，cityId=" + cityId);

            //根据城市ID获取城市天气
            weatherDataServiceImpl.syncDataByCityId(cityId);
        }
        log.info("End 天气数据同步任务");


    }
}
