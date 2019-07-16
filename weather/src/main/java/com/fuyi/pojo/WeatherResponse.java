package com.fuyi.pojo;

import java.io.Serializable;

/**
 * Author fuyi
 * ClassName WeatherResponse
 * Description 整个消息的返回对象
 * Param
 * Return
 * Date  2018/11/14 23:36
 */
public class WeatherResponse implements Serializable {

    private static final long serivalVersionUID = 1L;

    private Weather data;   //消息数据
    private String status;  //消息状态
    private String desc;    //消息描述

    public Weather getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
