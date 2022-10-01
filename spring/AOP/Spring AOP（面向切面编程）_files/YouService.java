package com.study.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/* 0配置+注解方式的业务类案例代码
 * @author SMILE.Huang
 * @date 2020-07-14 11:09
 */
@Service
public class YouService {
    public void work(){
        System.out.println("坐在办公室吹着空调开着音乐，开心的工作着。。。。");
    }
    public void sleep(){
        System.out.println("躺在自己的小窝里，刷着视频吃着零食，惬意的休息着...");
    }
    public void study(){
        System.out.println("坐在教室里敲着代码听着催眠曲，苦逼的写着作业.....");
    }
}
