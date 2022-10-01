package org.study.annotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
//1、定义该注解可以作用于哪些程序元素上
//@Target(ElementType.FIELD)  //仅作用域属性上
//@Target({ElementType.FIELD,ElementType.METHOD})//作用域多个程序元素
//简写方式,适用于对枚举ElementType非常熟悉的情况
@Target({FIELD,METHOD})
//2、定义该注解保留的阶段
@Retention(RetentionPolicy.RUNTIME)//保留到运行阶段，可被反射检测
@Documented
public @interface SelfAnnotation {
    //3、定义该注解的成员
    String value() ;//默认属性value，给了默认值
    int[] numbers() default 1;  //没有默认值
}
