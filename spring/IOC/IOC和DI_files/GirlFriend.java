package com.study.di;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 女朋友类
 * @author SMILE.Huang
 * @date 2021-03-12 10:07
 */
public class GirlFriend {
    private Integer gid;
    private String gname;
    /*常规使用方式：
    * 1、使用系统时间
    * java.util.Date d = new java.util.Date()
    * java.sql.Date  time = new java.sql.Date(d.getTime())
    * */
    private Date loveTime;//相恋时间
    private Integer[] luckNumbers;//幸运数字
    private List<String> manStar;//喜欢的男明星
    private Set<String> foods;// 喜欢的食物
    private Map<Integer,String> hotel;//房产

    public Integer[] getLuckNumbers() {
        return luckNumbers;
    }

    public void setLuckNumbers(Integer[] luckNumbers) {
        this.luckNumbers = luckNumbers;
    }

    public List<String> getManStar() {
        return manStar;
    }

    public void setManStar(List<String> manStar) {
        this.manStar = manStar;
    }

    public Set<String> getFoods() {
        return foods;
    }

    public void setFoods(Set<String> foods) {
        this.foods = foods;
    }

    public Map<Integer, String> getHotel() {
        return hotel;
    }

    public void setHotel(Map<Integer, String> hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", loveTime=" + loveTime +
                '}';
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Date getLoveTime() {
        return loveTime;
    }

    public void setLoveTime(Date loveTime) {
        this.loveTime = loveTime;
    }

    public GirlFriend() {
    }

    public GirlFriend(Integer gid, String gname, Date loveTime) {
        this.gid = gid;
        this.gname = gname;
        this.loveTime = loveTime;
    }
}
