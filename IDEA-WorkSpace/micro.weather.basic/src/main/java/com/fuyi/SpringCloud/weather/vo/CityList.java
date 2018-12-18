package com.fuyi.SpringCloud.weather.vo;

import org.apache.catalina.LifecycleState;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *Author fuyi
 *ClassName CityList <城市列表>
 *Description 将解析出来的城市信息存入集合
 *Param
 *Return
 *Date  2018/11/21 23:49
 */
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {
    @XmlElement(name = "d")
    private List<City> cityList;

    public List<City>getCityList(){
        return cityList;
    }
    public  void setCityList(List<City>cityList){
        this.cityList=cityList;
    }
}
