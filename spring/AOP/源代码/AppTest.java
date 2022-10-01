package org.example;

import static org.junit.Assert.assertTrue;

import org.example.lesson3.MyService;
import org.example.lesson3.YouService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
    /**
     * 只要通过@Test修饰的方法，都可以变成启动方法
     */
    @Test
    public void aop_xml(){
        //1、加载核心配置文件
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext_aop.xml");
        //2、没有织入横切关注点之前，调用业务类的方法
        MyService ms = ctx.getBean(MyService.class);
        ms.doInsert();
        System.out.println("******************");
        ms.doUpdate();
//        ms.selectAll();
    }

    @Test
    public void aop_zero(){
        //1、加载核心配置文件
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext_aop_0.xml");
        //2、没有织入横切关注点之前，调用业务类的方法
        YouService ms = ctx.getBean(YouService.class);
//        ms.doDelete();
        ms.show();
    }
}
