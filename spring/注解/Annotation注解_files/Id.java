package com.study.annotation.generateSQL;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 该注解用于指定主键
    当实体类的属性是数据库的主键时，由该注解进行标注
 * @author SMILE.Huang
 * @date 2021-04-06 15:40
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Id {
    String name() default "";
}
