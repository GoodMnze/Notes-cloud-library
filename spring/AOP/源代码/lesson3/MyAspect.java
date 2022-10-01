package org.example.lesson3;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * 分离出来的横切关注点，和业务无关的部分
 */
public class MyAspect {
    /**
     * 前置通知
     */
    public void handlerBefore(){
        System.out.println("切面中的handlerBefore");
    }
    /**
     * 后置通知
     */
    public void handlerAfter(){
        System.out.println("切面中的handlerAfter");
    }
    /**
     * 环绕通知
     * @param jp  携带Joinpoint点参数（业务类中的方法）
     */
    public void handlerAround(ProceedingJoinPoint jp){
        System.out.println("切面通知先开始执行....");
        try {
            //执行业务方法
            Object r = jp.proceed();
            System.out.println("业务类的连接点方法："+jp.getSignature().getName());
            System.out.println("目标对象："+jp.getTarget().getClass());
            //r表示业务方法执行的返回值
            System.out.println("直接结果是："+r);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("切面通知后面再执行.....");
    }
}
