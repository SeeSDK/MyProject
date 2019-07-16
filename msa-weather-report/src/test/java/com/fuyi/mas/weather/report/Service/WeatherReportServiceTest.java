package com.fuyi.mas.weather.report.Service;

import com.fuyi.mas.weather.report.pojo.Weather;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherReportServiceTest {
    @Autowired
    private WeatherReportService weatherReportService;

    @Test
    public void testGetDataByCityId() {
        Weather weather = weatherReportService.getDataByCityId("101280601");

        assertEquals("Get Data By City Id", "昆明", weather.getCity());

    }
}
