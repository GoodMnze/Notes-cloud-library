package com.study.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @author SMILE.Huang
 * @date 2019-08-20 9:19
 */
public class DaoDemo {
    public static void main(String[] args) {
//        //测试，从Spring容器中获取注入成功的Bean对象
////        ApplicationContext ctx =
////                new ClassPathXmlApplicationContext("applicationContext_druid.xml");
////        JdbcTemplate jdbc = ctx.getBean(JdbcTemplate.class);
////        String sql="insert into dept values(81,'技术部','人工智能')";
////        int i=jdbc.update(sql);
////        System.out.println(i>0?"成功":"失败");

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext
                        ("applicationContext_druid.xml");
        DeptDAO dao = ctx.getBean(DeptDAO.class);
        int i=dao.doInsert(83,"美工部","旧金山");
        System.out.println(i>0?"新增成功":"新增失败");
    }
}
