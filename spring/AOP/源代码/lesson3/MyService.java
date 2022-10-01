package org.example.lesson3;

/**
 * 模拟业务类，也是目标对象Target
 */
public class MyService {
    public Integer doInsert(){
        System.out.println("模拟执行新增操作.....");
        return 1;
    }
    public Integer doUpdate(){
        System.out.println("。。。。模拟执行修改操作");
        return 1;
    }
    public void selectAll(){
        System.out.println("查询所有的业务放啊******");
    }
    public void selectById(){
        System.out.println("根据主键查询单个对象￥￥￥￥￥");
    }
}
