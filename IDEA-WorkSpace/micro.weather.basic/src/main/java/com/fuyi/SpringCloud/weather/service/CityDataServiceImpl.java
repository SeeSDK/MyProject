package com.fuyi.SpringCloud.weather.service;

import com.fuyi.SpringCloud.weather.Utils.XmlBulider;
import com.fuyi.SpringCloud.weather.service.iml.CityDataService;
import com.fuyi.SpringCloud.weather.vo.City;
import com.fuyi.SpringCloud.weather.vo.CityList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Author fuyi
 * ClassName CityDataServiceImpl
 * Description
 * Param
 * Return
 * Date  2018/11/22 23:46
 */
@Service
public class CityDataServiceImpl implements CityDataService {
    private static final Logger log = LoggerFactory.getLogger(CityDataServiceImpl.class);

    /**
     * Author fuyi
     * ClassName CityDataServiceImpl
     * Description 城市数据服务
     * Param
     * Return
     * Date  2018/11/22 23:46
     */
    @Override
    public List<City> listCity() throws Exception {

        //读取XML文件
        log.info("------------->开始读取XML文件,并将其转为文本");
        Resource resource = (Resource) new ClassPathResource("citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        br.close();
        log.info("---------------->关闭输入流，读取完成");

        //xml转为java对象
        log.info("------------------------------------>XmlBulider工具类开始将xml转为java对象");
        CityList cityList = (CityList) XmlBulider.xmlStrToObject(CityList.class, buffer.toString());
        return cityList.getCityList();
    }
}
