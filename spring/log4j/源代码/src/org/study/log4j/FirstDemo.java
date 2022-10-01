package org.study.log4j;

import org.apache.log4j.*;

public class FirstDemo {
    public static void main(String[] args) {
        //log4j的三大核心组件
        //1、Logger 日志对象  获取根日志对象
        Logger logger = Logger.getRootLogger();
        //2、log4j的默认配置（输出目的地=控制台，输出的格式=已设置好）
        BasicConfigurator.configure();
//        //2、Appender 追加对象(指定日志的输出目的地)
//        Appender consoleAppender = new ConsoleAppender();
//        logger.addAppender(consoleAppender);
//        //3、Layout 布局对象（指定日志输出的格式）
//        Layout layout = new SimpleLayout();
        //4、设置日志的输出级别(要提前设置)
        logger.setLevel(Level.ERROR);//debug及其以上的级别的信息都会输出
        //4、输入相关日志信息
        logger.debug("我是最基础的调试信息");
        logger.info("我是调试的info信息");
        logger.warn("我是警告信息");
        logger.error("我是错误信息");
        logger.fatal("我是严重的致命错误信息");

    }
}
