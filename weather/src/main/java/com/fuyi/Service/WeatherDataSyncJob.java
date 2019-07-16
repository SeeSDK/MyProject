package com.fuyi.Service;

import com.fuyi.Service.impl.WeatherDataCollectionService;
import com.fuyi.pojo.City;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Author fuyi
 * ClassName WeatherDataSyncJob
 * Description 天气数据同步任务
 * Param
 * Return
 * Date  2018/12/19 22:37
 */
public class WeatherDataSyncJob extends QuartzJobBean {
    private final static Logger log = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("开始天气数据同步服务 ----------->");
        //TODO 改为由城市数据API微服务来提供数据。
        List<City> cityList = null;
        try {
            //TODO 调用城市数据API

            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280601");
            cityList.add(city);
        } catch (Exception e) {
            log.error("获取城市信息异常", e);
            throw new RuntimeException("获取城市信息异常", e);
        }

        for (City city : cityList) {
            String cityId = city.getCityId();
            log.info("获取到城市ID：" + cityId + "开始天气数据同步任务===========>");

            //根据城市ID同步天气数据
            weatherDataCollectionService.syncDataByCityId(cityId);
        }
        log.info("同步天气数据任务完成《《《《《《《《《《《《《");

    }
}
