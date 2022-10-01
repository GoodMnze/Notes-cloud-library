package com.study;

import static org.junit.Assert.assertTrue;

import com.study.pojo.Dept;
import com.study.pojo.Emp;
import com.study.service.DeptService;
import com.study.service.EmpService;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static EmpService es;
    Logger logger = Logger.getRootLogger();
    private static DeptService ds;
    @BeforeClass
    public static void init(){
        //加载核心配置文件
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("applicationContext_0.xml");
        //获取Service对象
        // 提取全局变量：选中变量名——》右键Refactor--》Introduce Field
        //ds = ctx.getBean(DeptService.class);

        //零配置+注解测试方式
        es = ctx.getBean(EmpService.class);
    }

    @Test
    public void zero(){
        Emp emp = es.selectById(7369);
        System.out.println(emp);
        System.out.println("********************************");
        List<Emp> emps = es.selectByDeptNo(10);
        System.out.println("名字\t职位\t部门名称");
        for (Emp emp1 : emps) {
            System.out.println(emp1.getEname()+"\t"+emp1.getJob()+"\t"+emp1.getDname());
        }
    }

    @Test
    public void t1(){
        List<Dept> list = ds.selectAll();
        System.out.println("查询结果总条数："+list.size());
        for (Dept dept : list) {
            //System.out.println(dept);
            logger.info(dept);
        }
    }
}
