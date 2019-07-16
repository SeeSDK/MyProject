package com.fuyi.weather.citydata.service.Controller;

import com.fuyi.weather.citydata.service.Service.CityDataService;
import com.fuyi.weather.citydata.service.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author fuyi
 * ClassName CityController
 * Description
 * Param
 * Return
 * Date  2018/12/23 16:15
 */
@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {
        return cityDataService.listCityList();
    }
}
