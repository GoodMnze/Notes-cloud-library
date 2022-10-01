package com.study.annotation.generateSQL;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 该注解用于指定数据库的表名
    当实体类的类名和数据库的表名不一致的时候，必须指定value属性
 * @author SMILE.Huang
 * @date 2021-04-06 15:38
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Table {
    String value() default "";
}
