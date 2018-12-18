package com.fuyi.SpringCloud.weather.pojo;

import java.io.Serializable;
import java.util.List;

public class Weather extends WeatherResponse implements Serializable {
    private static final long serivalVersionUID = 1L;
    private String city;  //城市
    private String aqi; //空气指数
    private String wendu;//温度
    private String ganmao;
    private Yesterday yesterday;
    private List<Forecast> forecast;
    public String getCity() {
        return city;
    }

    public String getAqi() {
        return aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
