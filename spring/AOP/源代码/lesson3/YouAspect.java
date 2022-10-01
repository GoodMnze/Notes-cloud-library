package org.example.lesson3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.xml.ws.Action;

/**
 * 零配置+注解的方式
 * 切面类.需要注解@Aspect来修饰
 */
@Component
@Aspect
public class YouAspect {
    //定义全局的连接对象（利用execution来筛选业务方法）
    @Pointcut(value = "execution(* org.example.lesson3.YouService.*(..))")
    public void cut(){    }

//    @Before(value = "cut()")
//    public void before(){
//        System.out.println("&&&&&&&我是置前通知");
//    }
//
    @After("cut()")
    public void xxx(ProceedingJoinPoint jp){
        String name =jp.getSignature().getName();
        System.out.println("%%%%%%%%我会再业务方法之后执行...");
    }

    //@Around(value = "execution(* org.example.lesson3.YouService.do*(..))")
    @Around("cut()")
    public void around(ProceedingJoinPoint jp){
        //记录方法开始的时间
        Long begin = System.currentTimeMillis();
        //调用业务方法
        String name =jp.getSignature().getName();
        System.out.println("开始调用"+name+"方法");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("执行"+name+"消耗了"+(end-begin)+"毫秒");
    }
}
