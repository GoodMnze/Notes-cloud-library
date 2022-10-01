package com.study.aop;

import com.study.di.Clazz;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* 定义服务类（切面类）
   1、置前通知方法
   2、置后通知方法
   3、环绕通知方法
 * @author SMILE.Huang
 * @date 2020-07-14 9:35
 */
public class MyAspects {
    public void before(){
        System.out.println("我是切面类中的前置通知Before Advice！！！！");
    }
    public void after(){
        System.out.println("！！！！！！！我是切面类中的置后通知After Advice");
    }
    public void around(ProceedingJoinPoint jp){

        System.out.println("开启环绕通知模式：");
        Long begin = System.currentTimeMillis();//记录方法开始的时间戳
        try {
            Object obj = jp.proceed();//开始调用业务方法
            //obj表示业务类的返回类型
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Long end = System.currentTimeMillis();
        System.out.println("环绕通知模式结束，" +
                "该方法总共花费时长为："+(end-begin)+"毫秒");

    }

    public void around2(JoinPoint jp){
        System.out.println("我是环绕通知开始，利用反射调用业务相关方法...");

        try {
            //获取目标业务类的Class对象
            Class cls = jp.getTarget().getClass();
            //调用无参构造方法
            Object obj = cls.newInstance();
            //获取业务方法名
            String methodName = jp.getSignature().getName();
            //获取业务方法的参数
            Object[] args = jp.getArgs();//实参列表
            System.out.println("实参长度"+args.length);
            Class[] aaa = new Class[args.length];
            int i=0;
            for (Object arg : args) {
                System.out.print("参数值："+arg.toString()+"--类型："
                        +arg.getClass()+"\t");
                aaa[i++]=arg.getClass();
            }
            System.out.println("\n调用业务方法"+methodName+"。。。。。");
            //获取方法对象
            Method m = cls.getDeclaredMethod(methodName,aaa);
            //调用业务方法
            m.invoke(obj,args);
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println("环绕通知结束。。。");
    }
}
