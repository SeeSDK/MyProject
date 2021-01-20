package com.seesdk.test;

import com.seesdk.microcloud.Dept_8001_SrartSpringCloudApplication;
import com.seesdk.microcloud.service.IDeptService;
import com.seesdk.vo.Dept;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.annotation.Resource;

@SpringBootTest(classes = Dept_8001_SrartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:application*"})
public class IDeptServiceTest  {
    @Resource
   private IDeptService iDeptService;
    @Test
    public void testGet() {
        this.iDeptService.get(1);
    }
    @Test
    public void testAdd() {
        Dept dept=new Dept();
        dept.setDname("测试部-"+System.currentTimeMillis());
        dept.setLoc("位置-"+System.currentTimeMillis());
    }
    @Test
    public void testList() {
        System.out.println(this.iDeptService.list());
    }
}