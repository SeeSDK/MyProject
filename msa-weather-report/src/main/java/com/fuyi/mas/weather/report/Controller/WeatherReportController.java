package com.fuyi.mas.weather.report.Controller;

import com.fuyi.mas.weather.report.Service.WeatherReportService;
import com.fuyi.mas.weather.report.pojo.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Author fuyi
 * ClassName WeatherReportController
 * Description
 * Param
 * Return
 * Date  2018/12/21 23:48
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {
    private final static Logger log = LoggerFactory.getLogger(WeatherReportController.class);

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        //TODO 改为由城市数据API微服务提供数据
        List<City> cityList;
        try {
            cityList = null;
            //TODO 调用城市数据API
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280601");
            city.setCityName("昆明");
            cityList.add(city);

            city = new City();
            city.setCityId("101280602");
            city.setCityName("惠州");
            cityList.add(city);

        } catch (Exception e) {
            log.error("获取城市天气信息异常！", e);
            throw new RuntimeException("获取城市天气信息异常！", e);
        }
        model.addAttribute("title", "傅轶的天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }
}