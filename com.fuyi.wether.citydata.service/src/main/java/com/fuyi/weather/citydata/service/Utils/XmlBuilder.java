package com.fuyi.weather.citydata.service.Utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

public class XmlBuilder {
    /**
     *Author fuyi
     *ClassName XmlBulider
     *Description 将XML字符串转换为指定类型的POJO
     *Param
     *Return
     *Date  2018/11/22 23:34
     */
    public static Object xmlStrToObject(Class<?> clazz,String xmlStr)throws Exception{
        Object xmlObject=null;
        Reader reader = null;
        JAXBContext context=JAXBContext.newInstance(clazz);

        //将XML转成对象的核心接口
        Unmarshaller unmarshaller=context.createUnmarshaller();
        reader =new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);
        if (null!=reader){
            reader.close();
        }
        return xmlObject;
    }
}
