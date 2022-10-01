package com.study.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

/**
 * 日志输出Log4j
 * 三大核心组件
 *      Logger          负责输出日志
 *      Appender        输出目的地
 *      Layout          输出的格式
 * 注意：一个日志组件，可以有多个输出目的地，但是每个目的地只能对应一种格式
 * 读取配置文件有如下三种情况：
 * 1、如果有BasicConfigurator.configure();，
 *      使用默认配置在控制台打印日志信息
 * 2、如果在【根目录】下存在log4j.properties文件，则默认读取该文件，将日志信息按照配置的方式输出
 * 3、如果存在自定义名字的配置文件，需要额外通过读取的方式才能使配置生效
 *      请参考CustomizeLog.java中的代码
 */
public class CustomizeLog {
//    static Logger logger = Logger.getLogger(CustomizeLog.class);
    public static void main(String[] args) {
        //获取工程所在的目录
        String path =CustomizeLog.class.getClassLoader().getResource("//").getPath();
        //通过PropertyConfigurator指定配置文件的路径
        PropertyConfigurator.configure(path+"config/hyt.properties");
        Logger logger = Logger.getLogger(CustomizeLog.class);


        logger.warn("我警告你，你最好给我小心点，不然我揍你");

    }
}
