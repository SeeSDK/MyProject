package com.fuyi.weather.citydata.service.Service;

import com.fuyi.weather.citydata.service.pojo.City;

import java.util.List;

/**
 * Author fuyi
 * ClassName CityDataService
 * Description 获取城市列表
 * Param
 * Return
 * Date  2018/12/23 15:58
 */
public interface CityDataService {
    List<City> listCityList() throws Exception;
}
