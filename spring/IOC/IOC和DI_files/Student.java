package com.study.di;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* 学生类
 * @author SMILE.Huang
 * @date 2020-07-11 15:01
 */
public class Student {
    private Integer sid;
    private String name;
    private String sex;
    private java.util.Date birth;//出生日期
    private java.sql.Date adultDate;//成年日

    private String[] fruits;//喜欢的水果
    private List<String> movies;//喜欢的电影
    private Set<String> games;//喜欢的游戏
    private Map<String,String> stars;//喜欢的明星

    public String[] getFruits() {
        return fruits;
    }

    public void setFruits(String[] fruits) {
        this.fruits = fruits;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Map<String, String> getStars() {
        return stars;
    }

    public void setStars(Map<String, String> stars) {
        this.stars = stars;
    }

    public java.sql.Date getAdultDate() {
        return adultDate;
    }

    public void setAdultDate(java.sql.Date adultDate) {
        this.adultDate = adultDate;
    }

    @Override
    public String toString() {
        //利用sql.Date获取当前系统时间
        java.util.Date d1 = new java.util.Date();
        java.sql.Date dd = new java.sql.Date(d1.getTime());

        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                '}';
    }

    public Integer getSid() {
        return sid;
    }
    // private Integer sid;
    //setter方法 属性名id
    public void setId(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    /*属性名：sAName*/
    public void setSAName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Student() {
    }

    public Student(Integer sid, String name, String sex, Date birth) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
    }
}
