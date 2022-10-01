package org.study.log4j;

import org.apache.log4j.*;

/**
 * 一个日志管理器对象Logger
 *          可以有多个输出器Appenders
 *                      每个输出器只能指定一种格式
 */
public class SecondDemo {
    public static void main(String[] args) {
        //1、获取日志对象
        Logger logger = Logger.getRootLogger();
        //3、创建格式输出器，指定日志的输出格式
//        Layout layout = new SimpleLayout();//默认输出格式
        Layout layout = new PatternLayout("%d [%l] %p %m%n");//自定义格式
        //2、创建追加器，指定日志的输出目的地。必须指定输出器的格式（调用无参报错）
        Appender appender = new ConsoleAppender(layout);
//        appender.setLayout(layout);
        //5、给日志指定目的地
        logger.addAppender(appender);
        //6、指定日志的输出级别
        logger.setLevel(Level.DEBUG);
        //7、接下来输出日志信息
        int a=10,b=4;
        logger.debug("变量a"+a+"变量b="+b);
        int c = a+b;
        logger.info("相加的结果是："+c);
        try{
            int x = a*b;
            logger.info("相乘的结果是："+x);
            int m = a/b;
            logger.info("相除的结果是："+m);
        }catch (Exception e){
            logger.error("报错了，错误信息是："+e.getMessage());
        }
        logger.debug("程序运行结束~~~~");
    }
}
