package org.study.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 注解的获取
 * 1、如何通过反射获取注解信息
 */
public class UseAnnotation {
    //第三步：通过反射获取程序元素的注解信息
    public static void main(String[] args) {
        //1、获取Class对象
        Class cls = MyClass.class;
        //2、获取所有属性对象
        Field[] fields = cls.getDeclaredFields();
        //3、遍历所有属性
        for (Field field : fields) {
            //4、判断属性上是否存在某个注解
            if(field.isAnnotationPresent(MyAnnotation.class)){
                //5、获取属性上的注解对象
                MyAnnotation anno = field.getDeclaredAnnotation(MyAnnotation.class);
                System.out.println("属性"+field.getName()+"上存在注解MyAnnotation");
                System.out.println("它的成员的值分别是：value="+anno.value());
                System.out.println("它的成员的值分别是：isOK="+anno.isOK());

            }
        }
    }
}

//第二步，调用（使用）注解
class MyClass{
    @MyAnnotation(value = "主键编号",isOK = true)
    private Integer cid;//编号
    private String cname;//名字
    @MyAnnotation
    private String master;//班主任
    @MyAnnotation(value = "班级人数",isOK = false)
    private Integer count;//人数
}

//第一步，自定义注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String value() default "";
    boolean isOK() default false;
}
