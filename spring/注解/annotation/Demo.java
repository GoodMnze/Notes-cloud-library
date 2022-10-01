package org.study.annotation;

import javax.servlet.annotation.WebServlet;
import java.util.Date;

/**
 * 常见的注解
 */
@WebServlet(value = "/demo",name = "5")
public class Demo {

    public String name;
    public static void main(String[] args) {
        String[] arr = {"a","b"};
        Date now  = new Date();
        now.toLocaleString();
        now.toString();
    }

}
