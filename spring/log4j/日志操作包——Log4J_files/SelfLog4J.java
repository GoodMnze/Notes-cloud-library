package com.study.log4j;

import org.apache.log4j.Logger;

/**
 * 读取默认的配置文件
 * 要求如下：
 * 1、文件名必须是log4j.properties
 * 2、该文件必须在编译之后的根目录下
 *          ①可以放在src文件中（但是会造成src职责不清晰，这里是放源代码的）
 *          ②推荐在工程下创建resources文件夹，然后Make Directory as -->Resources
 *                  将log4j.properties放到resources文件夹下
 */
public class SelfLog4J {
    static Logger logger = Logger.getLogger(SelfLog4J.class);
    public static void main(String[] args) {
        //直接输出日志格式
        //日志输出对象默认会读取编译之后的【根目录】下面的log4j.properties文件
        logger.debug("我是调试信息。。。");
        logger.info("我是一般信息。。。");
        logger.warn("我警告你，今天必须给我一个微笑，不然我就揍死你");
    }
}
