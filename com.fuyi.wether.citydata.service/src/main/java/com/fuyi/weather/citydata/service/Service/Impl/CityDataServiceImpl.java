package com.fuyi.weather.citydata.service.Service.Impl;

import com.fuyi.weather.citydata.service.Service.CityDataService;
import com.fuyi.weather.citydata.service.Utils.XmlBuilder;
import com.fuyi.weather.citydata.service.pojo.City;
import com.fuyi.weather.citydata.service.pojo.CityList;
import org.apache.catalina.WebResource;
import org.apache.catalina.WebResourceRoot;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 *Author fuyi
 *ClassName 城市数据服务
 *Description
 *Param
 *Return
 *Date  2018/12/23 16:00
 */
@Service
public class CityDataServiceImpl implements CityDataService {
    @Override
    public List<City> listCityList() throws Exception {
        //读取XML文件
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";

        while ((line= br.readLine())!=null){
            buffer.append(line);
        }
        br.close();

        //XML转换为Java对象
        CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class,buffer.toString());

        return cityList.getCityList();
    }
}
