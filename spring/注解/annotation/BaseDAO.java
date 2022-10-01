package org.study.annotation;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class BaseDAO<T> extends BaseDB{
    private Class<T> entityClass;
    //构造方法
    public BaseDAO(Class<T> entityClass){
        this.entityClass= entityClass;
    }

    public  List<T> query(String sql,  Object... param) {
        return  super.query(sql, new ToEntityRowMapper(), param);
    }

    //将结果集中的一行数据，转换成一个实体类对象
    class ToEntityRowMapper implements RowMapper<T>{
        @Override
        public T rowmap(ResultSet rs) throws SQLException {
            //实体对象
            T entity =null;
            try {
                //通过反射调用该实体类的无参构造方法
                entity = entityClass.newInstance();
                //通过反射给实体对象赋值
                ResultSetMetaData metaData = rs.getMetaData();//获取结果集的所有信息
                for(int i=1;i<=metaData.getColumnCount();i++){
                    //获取列名
                    String name = metaData.getColumnName(i).toLowerCase();
                    //列名=属性名,根据属性名字，获取Field对象
                    Field field = null;
                    try {
                        field = entityClass.getDeclaredField(name);
                    } catch (NoSuchFieldException e) {
                        field = findField(name);//通过注解再查一次
                        if(field==null){
                            //列名和属性名不相同
                            System.out.println("查询了"+name+"列,但是实体类中没有对应的属性");
                            continue;
                        }
                    }
                    //破坏封装
                    field.setAccessible(true);
                    //给属性赋值
                    field.set(entity,rs.getObject(i));
                }

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return entity;
        }
    }

    /**
     * 当列名和属性名不匹配时，通过查找注解MyColumn来判断是否存在属性
     * @param columnName
     * @return
     */
    public Field findField(String columnName){
        //1、获取所有属性
        Field[] fields = entityClass.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(MyColumn.class)){
                MyColumn anno = field.getDeclaredAnnotation(MyColumn.class);
                if(anno.name().equals(columnName)){//注解的名字和列名匹配，返回该属性对象
                    return field;
                }
            }
        }
        return null;
    }
}
