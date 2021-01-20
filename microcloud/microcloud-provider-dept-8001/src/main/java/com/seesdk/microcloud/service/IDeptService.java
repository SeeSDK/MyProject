package com.seesdk.microcloud.service;

import com.seesdk.vo.Dept;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public interface IDeptService {
    public Dept get(long id) ;
    public boolean add(Dept dept) ;
    public List<Dept> list() ;
}
