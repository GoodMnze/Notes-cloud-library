package com.study.dao;

import com.study.pojo.Emp;
import com.study.pojo.EmpDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2020-07-16 15:23
 */
public class DaoTest {

    private EmpDAO dao;

    @Before
    public void init(){
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        dao = ctx.getBean(EmpDAO.class);
    }

    @Test
    public void t1(){
        //查询所有
        List<Emp> list = dao.selectAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
