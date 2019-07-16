package com.fuyi.SpringCloud.weather.pojo;

import java.io.Serializable;

/**
 * Author fuyi
 * ClassName Yesterday
 * Description 昨日天气类
 * Param
 * Return
 * Date  2018/11/14 23:25
 */
public class Yesterday implements Serializable {
    private static final long serivalVersionUID = 1L;
    private String date;     //日期，包含未来五天
    private String high;     //最高温度
    private String fx;       //风向
    private String low;      //最低温度
    private String fl;       //风力
    private String type;     //天气类型

    public String getDate() {
        return date;
    }

    public String getHigh() {
        return high;
    }

    public String getFx() {
        return fx;
    }

    public String getLow() {
        return low;
    }

    public String getFl() {
        return fl;
    }

    public String getType() {
        return type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public void setType(String type) {
        this.type = type;
    }
}
