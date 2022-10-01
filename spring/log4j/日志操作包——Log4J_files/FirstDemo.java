package com.study.log4j;

import org.apache.log4j.*;

/**
 * 使用Log4j的默认设置（输出目的地=控制台）
 * 学习默认设置的方式（输出目的地=控制台），指定输出格式
 */
public class FirstDemo {
    public static void main(String[] args) {
        //启动logger的默认设置 (输出目的地=控制台)
       // BasicConfigurator.configure();
        //获取Logger对象，负责输出日志
        Logger logger =
                Logger.getLogger(FirstDemo.class);
        //自定指定输出的目的地和输出的格式
        //%l  输出日志事件的发生位置，包括类目名、发生的线程，以及在代码中的行数
//        logger.addAppender(
//                new ConsoleAppender(
//                        new PatternLayout("%l 级别=%p 内容=%m%n")));

        Layout layout = new PatternLayout("%l 级别=%p 内容=%m%n");


        Appender appender = new ConsoleAppender(layout);
        logger.addAppender(appender);


        //指定日志输出的级别  输出指定级别及以上的信息
        logger.setLevel(Level.ERROR);
        //模拟输出不同级别的日志信息  从小到大
        logger.trace("追踪信息");
        logger.debug("调试信息");
        logger.info("一般信息");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命错误");


    }
}
