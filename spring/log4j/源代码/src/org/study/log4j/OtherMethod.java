package org.study.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 既没有使用BasicConfigurator.configure();默认配置
 * 也不想读取log4j.properties文件（或者不存在这个文件）
 * 可以通过程序读取自定义格式的配置文件
 */
public class OtherMethod {
    static Logger logger = Logger.getLogger(OtherMethod.class);
    public static void main(String[] args) {
        //读取自定义的配置文件
        String path =
                OtherMethod.class.getClassLoader()
                        .getResource("//").getPath();
        logger.debug("读取的路径是："+path);
        PropertyConfigurator.configure(path+"hyt.properties");
        //其他的日志信息
        logger.info("读取配置文件成功");
    }
}
