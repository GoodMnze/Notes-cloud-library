package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author SMILE.Huang
 * @date 2020-07-14 11:12
 */
@Component
@Aspect  //定义它是切面类
public class YouAspects {
    /*定义切入点，用于筛选业务类的方法*/
    @Pointcut(value = "execution(* com.study.aop.YouService.sleep(..))")
    public void cut(){}

    @Before("cut()")//cut方法此时表示切入点对象
    public void before(){
        System.out.println("这是一个置前通知，你看，后面就要调用sleep方法了...");
    }

    @After("cut()")//cut方法此时表示切入点对象
    public void aaa(){
        System.out.println("这是一个置后通知");
    }


    @Around(value = "execution(* com.study.aop.YouService.work(..))")
    public void around(ProceedingJoinPoint jp){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = sdf.format(new Date());
        System.out.println("开启日志记录，当前时间："+d);
        Object obj=null;
        try {
             obj = jp.proceed();//开始调用业务方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("日志结束，方法的返回值是："+obj);
    }
}
