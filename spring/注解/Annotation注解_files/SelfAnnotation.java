package com.study.annotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*自定义的注解
 1、类型是@interface
 2、注解成员：默认方法value
 3、注解成员：一定是无参的，要求有返回类型。返回类型只能是以下几种
    （1）八大基础数据类型、
    （2）String、Class类型，enum枚举类型、Annotation类型
    （3）以上所有类型的数组
  4、注解成员：可以有默认返回值，用关键词default来定义
  5、注解可以使用元注解（注解的注解）来进行修饰
  (1)Target 指定注解使用在哪些程序元素上，类型是枚举ElementType[]
    代表当前注解可以作用于以下类型中的一个，或者是多个
    public enum ElementType{
    TYPE，//类，接口（包括注解类型）或enum声明
    FIELD,//修饰属性（包括 enum 实例）
    METHOD，//修饰方法
    PARAMETER,//修饰参数
    CONSTRUCTOR,//修饰构造方法
    PACKAGE,//修饰包
    LOCAL_VAEIABLE,//本地变量
    ANNOTATION_TYPE//修饰注解
   }
   @Retention
   类型是RetentionPolicy类型
    SOURCE,//源代码：即此注解只能保存在源代码中     * 当编译时，会被丢弃
    CLASS,//class文件：即此注解可以在class文件中保留 * 但会被jvm丢弃
    RUNTIME //运行期：即此注解可以在运行时保留     * 可以通过反射获得
 * @author SMILE.Huang
 * @date 2020-06-06 9:30
 */
//注解SelfAnnotation，可以作用于方法和属性上
//@Target({ElementType.METHOD,ElementType.FIELD})
@Target({METHOD,FIELD})  //上一句的简写，需要在导包处写上static
//运行期间依旧保留，可通过反射读取该注解
@Retention(RetentionPolicy.RUNTIME)
public @interface SelfAnnotation {
    //注解的成员
    public String value() default "abc";
    String[] names() default "六脉神剑";
    MyMark remark() default MyMark.YES;
}
