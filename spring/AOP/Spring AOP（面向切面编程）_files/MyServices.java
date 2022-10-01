package com.study.aop;

import java.util.List;

/* 模拟业务类
 * @author SMILE.Huang
 * @date 2020-07-14 9:29
 */
public class MyServices {
    public List selectAll(){
        System.out.println("正在执行查询所有的方法selectAll....");
        return null;
    }
    public  Integer doInsert(Integer id,String name){
        System.out.println("正在执行新增操作doInsert********");
        return 1;
    }
    public Boolean doUpdate(Integer id,String name){
        System.out.println("正在执行修改操作doUpdate%%%%%%%%");
        return false;
    }
    public Boolean doDelete(Integer id){
        try {
            Thread.sleep(1000);//模拟方法执行的时长
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正在执行删除操作doUpdate@@@@@@@@@@@@");
        return false;
    }
}
