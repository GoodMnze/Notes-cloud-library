package org.study.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * 已经在resources文件中存在log4j.properties文件
 *  的前提下
 *          下面这段代码才能正常运行
 */
public class Log4jTest {
    //1、日志对象   getLogger(类名.class)
    static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        //2、没有指定输出目的地和输出格式的情况下
        //3、也没有指定日志的输出级别
        logger.info("info%%%%%%%%%%%%%%%");
        logger.warn("warn###################");
        logger.error("error!!!!!!!!!!!!!!!!!");
        logger.fatal("fatal...................");
    }
}
