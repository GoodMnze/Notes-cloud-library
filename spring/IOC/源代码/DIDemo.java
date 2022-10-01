package org.example.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class DIDemo {
    public static void main(String[] args) {
        //1、读取配置文件
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext
                        ("applicationContext_di.xml");
        System.out.println("*********加载完毕***********");
        //2、从容器中获取对象
        Student stu1 = ctx.getBean("stu_other",Student.class);
        System.out.println("喜欢的食物的数量："+stu1.getFoods().length);
        for (String food : stu1.getFoods()) {
            System.out.println("食物的名字："+food);
        }
        System.out.println("喜欢的明星："+stu1.getStarts().size());
        stu1.getStarts().forEach(System.out::println);

        System.out.println("前任的名字及爱称："+stu1.getLover().size());
        Set<String> ks = stu1.getLover().keySet();
        for (String k : ks) {
            System.out.println("名字："+k+",爱称："+stu1.getLover().get(k));
        }

        System.out.println("纪念日："+stu1.getDays().size());
        stu1.getDays().forEach(System.out::println);

        System.out.println("入学日期："+stu1.getInschool());

    }
}
