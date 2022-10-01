package com.study.di;

import java.util.Date;

/* 普通的类
 * @author SMILE.Huang
 * @date 2021-03-12 9:05
 */
public class Clazz {
    private Integer cid;
    private String name;
    private Integer count;
    private Date openTime;//开班日期

    public void setTime(Date openTime){
        this.openTime=openTime;
    }

    public void show(){
        System.out.println("班级编号："+cid);
        System.out.println("班级名称："+name);
        System.out.println("班级人数："+count);
        System.out.println("开班日期："+openTime.toString());

    }

    public Clazz(Integer cid, String name, Integer count, Date openTime) {
        this.cid = cid;
        this.name = name;
        this.count = count;
        this.openTime = openTime;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public Clazz() {
    }

    public Clazz(Integer cid, String name, Integer count) {
        this.cid = cid;
        this.name = name;
        this.count = count;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
