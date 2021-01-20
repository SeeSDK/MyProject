package com.seesdk.microcloud.service.impl;

import com.seesdk.microcloud.dao.IDeptDAO;
import com.seesdk.microcloud.service.IDeptService;
import com.seesdk.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    IDeptDAO deptDAO;
    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return this.deptDAO.findAll();
    }
}
