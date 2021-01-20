package com.seesdk.microcloud.dao;

import java.util.List;
import com.seesdk.vo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IDeptDAO {
    public boolean doCreate(Dept vo) ;
    public Dept findById(Long id) ;
    public List<Dept> findAll() ;
}
