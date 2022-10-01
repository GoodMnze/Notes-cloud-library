package com.study.service;

import com.study.dao.DeptDAO;
import com.study.pojo.Dept;

import java.util.List;

public class DeptService {
    private DeptDAO dao;//通过xml方式注入dao对象

    public void setDao(DeptDAO dao) {
        this.dao = dao;
    }

    /**
     * 查询所有
     * @return
     */
    public List<Dept> selectAll(){
        return dao.selectAll();
    }
}
