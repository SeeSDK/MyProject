package iml;

import pojo.Weather;

public interface WeatherReportService {
    /**
     *Author fuyi
     *ClassName WeatherReportService
     *Description 根据城市ID查看天气信息
     *Param
     *Return
     *Date  2018/11/26 23:21
     */
    Weather getDataByCityId(String cityId);

}
