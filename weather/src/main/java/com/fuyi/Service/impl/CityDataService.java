package com.fuyi.Service.impl;

import com.fuyi.pojo.City;

import java.util.List;

/**
 * Author fuyi
 * ClassName CityDataService
 * Description 获取城市列表
 * Param
 * Return
 * Date  2018/11/22 23:44
 */
public interface CityDataService {
    List<City> listCity() throws Exception;
}
