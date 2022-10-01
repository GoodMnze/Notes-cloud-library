package com.study.dao;

import com.study.pojo.Dept;
import com.study.pojo.DeptDao;
import com.study.pojo.DeptService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @author SMILE.Huang
 * @date 2020-07-16 16:07
 */
public class ZeroDaoTest {
    private DeptDao dao;
    private DeptService ds;

    /*读取配置文件*/
    @Before
    public  void tt(){
        ApplicationContext clx=new ClassPathXmlApplicationContext("applicationContext_dao0.xml");
//        dao = clx.getBean(DeptDao.class);
        ds = clx.getBean(DeptService.class);
    }

    /*编写Test方法*/
    @Test
    public void t1(){
//        dao.selectById(20L);
        ds.test(20L);
    }
}
