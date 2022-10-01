package com.study.anotation;/*
 * @author SMILE.Huang
 * @date 2019-08-12 10:01
  使用自定义的注解
 */

import java.lang.annotation.Retention;

public class UseAnnotation {
    //@SelfAnnotation(desc = MyStatus.OK)
    //注解中的成员方法，可以理解为一个搬运工，是将值通过方法，转接给调用者
    //注解的成员成员，赋值的方式类似于属性---->方法=返回类型的值
    @SelfAnnotation(desc = {MyStatus.NoOK,MyStatus.OK},
                    value = "网贷",
                    age=300)
    public void run(){

    }
}
