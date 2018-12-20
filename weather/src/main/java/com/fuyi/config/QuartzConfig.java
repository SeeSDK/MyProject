package com.fuyi.config;

import com.fuyi.Service.WeatherDataSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *Author fuyi
 *ClassName QuartzConfig
 *Description Quartz 配置类
 *Param
 *Return
 *Date  2018/11/21 22:50
 */
@Configuration
public class QuartzConfig {
    private  final int time = 1800; //更新频率
    @Bean
    public JobDetail weatherDataSyncJobJobDeatil(){
        return JobBuilder.newJob(WeatherDataSyncJob.class).
                withIdentity("weatherDataSyncJob").storeDurably().build();
    }
    @Bean
    public Trigger sampleJobTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(time).repeatForever();
        return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobJobDeatil())
                .withIdentity("weatherDataSyncTrigger").withSchedule(scheduleBuilder).build();
    }
    //JobDetail:定义一个特定的Job。JobDetail实例可以使用JobBuilder API 轻松构建
    //Trigger ： 定义了何时来触发一个特定的job.
    //withIntervalInSeconds(2):意味着定时任务的执行频率为TIME秒一次。

}
