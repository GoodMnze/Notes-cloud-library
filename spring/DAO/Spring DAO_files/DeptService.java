package com.study.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
 * @author SMILE.Huang
 * @date 2020-07-16 16:50
 */
@Service
public class DeptService {
    @Autowired  //ctx.getBean(DeptDao.class)
    @Qualifier("deptDao")  //ctx.getBean("id",DeptDao.class);
    DeptDao dao;

    public void test(Long deptno){
        Dept dept = dao.selectById(deptno);
        if(dept==null){
            System.out.println("不存在该部门信息");
        }else{
            System.out.println("部门名字是："+dept.getDname());
        }
    }
}
