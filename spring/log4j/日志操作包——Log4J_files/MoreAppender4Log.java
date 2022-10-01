package com.study.log4j;

import org.apache.log4j.*;

import java.io.IOException;

/**
 * 添加多个输出目的地，为每个目的地指定输出格式
 */
public class MoreAppender4Log {
    public static void main(String[] args) {
        //1、定义Logger对象  参数是当前类.class
        Logger logger = Logger.getLogger(MoreAppender4Log.class);
        //2、定义输出的格式
        Layout layout1 =
                new PatternLayout("行数=%L,级别=%p,内容=%m%n");
        //3、定义输出的目的地
        Appender appender1 = new ConsoleAppender(layout1);

        //2、定义输出的格式
        Layout layout2 =
                new PatternLayout
                        ("行数=%L,时间=%d{yyyy-MM-dd HH:mm:ss},内容=%m%n");
        //3、定义输出目的地
        Appender appender2=null;
        try {
            appender2 =
                    new FileAppender(layout2,"yf03304.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4、添加指定的目的地
        logger.addAppender(appender1);
        logger.addAppender(appender2);
        //5、定义日志的输出级别
        logger.setLevel(Level.ERROR);
        //6、假设日志输出
        logger.info("我即将要开始计算我的题目了。。。。");
        int a = (int)(Math.random()*100);
        logger.debug("我生成的变量a="+a);
        int b = (int)(Math.random()*3);
        logger.info("我生成的变量b="+b);
        logger.warn("我要开始做除法了****，极有可能会报错");
        try{
            int c = a/b;
            logger.info("一切正常，计算结果是："+c);
        }catch (Exception e){
            logger.error("程序报错，错误信息是："+e.getMessage());
        }
        logger.debug("程序完毕，OVer");

    }
}
