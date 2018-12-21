package com.fuyi.mas.weather.report.pojo;

/**
 *Author fuyi
 *ClassName City
 *Description 将城市的XML转换为JavaBean
 *            Java自带了JAXB（Java Architeccture for XML Binding）工具,可以方便地处理XML，将其解析为JavaBean。
 *Param
 *Return
 *Date  2018/11/21 23:38
 *
 */


public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
