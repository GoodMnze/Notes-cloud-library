package com.study.service;

import com.study.dao.EmpDAO;
import com.study.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpDAO edao;
    public Emp selectById(Integer empno){
        return edao.selectById(empno);
    }

    public List<Emp> selectByDeptNo(Integer deptno){
        return edao.selectByDeptNo(deptno);
    }

}
