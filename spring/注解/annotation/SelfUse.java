package org.study.annotation;

import javax.xml.ws.WebServiceRef;
import java.sql.Date;

/**
 * 使用自定义注解
 * 1、假设注解的所有都有默认值，可以在调用时都不赋值
 * 2、如果注解的默认属性value没有赋值   调用注解默认是给value成员赋值
 * 3、如果注解的其他成员没有默认值，调用时必须明确指定是给哪个成员赋值
 */
public class SelfUse {
    @SelfAnnotation(value = "",numbers = 1) //所有类型的数组当只有一个值的时候，可以简写
    private Integer id;

    @SelfAnnotation(value = "Y",numbers = {1,2})
    private String name;

    @SelfAnnotation(value = "A",numbers = 8)
    private Date birth;

    @SelfAnnotation("")  //默认是个value成员赋值
    public void show(){

    }
}
