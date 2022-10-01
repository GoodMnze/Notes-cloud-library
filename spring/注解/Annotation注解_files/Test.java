package com.study.annotation.generateSQL;

import sun.reflect.generics.scope.ClassScope;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * @author SMILE.Huang
 * @date 2021-04-06 15:58
 */
public class Test {
    public static void main(String[] args) {
        try {
            KaoQin kk = new KaoQin(1,
                    new Timestamp(new Date().getTime()),
                    "肖一凡",1);
            Employee emp = new Employee(999,
                    "陈建超","夜店小王子",
                    java.sql.Date.valueOf("2020-1-1"));
            selectById(kk);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** select f1,f2,f3 from T where id=v0
     * @param obj
     */
    public static void selectById(Object obj){
        //获取Class对象
        Class cls = obj.getClass();
        //创建字符串拼接对象
        StringBuffer sb = new StringBuffer("select ");
        //获取所有的属性并且拼接
        Field[] fields=cls.getDeclaredFields();
        StringBuffer where = new StringBuffer();
        for (Field field : fields) {
            sb.append(field.getName().toLowerCase()+",");
            if(field.isAnnotationPresent(Id.class)){
                Id id = field.getDeclaredAnnotation(Id.class);
                if("".equals(id.name())){
                    where.append(field.getName());
                }else{
                    where.append(id.name());
                }
                //获取属性的值
                field.setAccessible(true);
                try {
                    Object o = field.get(obj);
                    if(o instanceof String){
                        where.append(" ='"+o+"'");
                    }else{
                        where.append(" ="+o);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(" from ");
        if(cls.isAnnotationPresent(Table.class)){
            Table table = (Table)cls.getDeclaredAnnotation(Table.class);
            if(!"".equals(table.value())){
                sb.append(table.value());
            }else{
                sb.append(cls.getSimpleName());
            }
        }else{
            sb.append(cls.getSimpleName());
        }
        sb.append(" where "+where);
        System.out.println("根据主键查询的SQL语句是："+sb);
    }

    /** delete形如：delete from T where id=v0
     * @param obj
     */
    public static void delete(Object obj) throws IllegalAccessException {
        //获取Class对象
        Class cls = obj.getClass();
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //拼接删除语句
        sb.append("delete from ");
        int i=0;
        if(cls.isAnnotationPresent(Table.class)){
            //判断注解@Table的value成员是否有值
            Table anno = (Table)cls.getDeclaredAnnotation(Table.class);
            if(!"".equals(anno.value())){
                i =1;
                sb.append(anno.value().toLowerCase());
            }
        }
        if(i==0)
            sb.append(cls.getSimpleName().toLowerCase());
        //获取所有的属性
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(Id.class)){
                Id anno = field.getDeclaredAnnotation(Id.class);
                if("".equals(anno.name())){
                    sb.append(" where "+field.getName()+"=");
                }else{
                    sb.append(" where "+anno.name()+"=");
                }
                //破坏封装
                field.setAccessible(true);
                Object value = field.get(obj);
                if(value instanceof String){
                    sb.append("'"+field.get(obj).toString()+"'");
                }else{
                    sb.append(field.get(obj).toString());
                }
            }
        }
        System.out.println("删除语句："+sb);
    }
}
