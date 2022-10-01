package org.example.lesson2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 学生类
 * 1、全参构造方法  Student(Integer,String,Date,String,BigDecimal)
 * 2、无参构造方法
 * 3、带两个参数的Student(Integer sid,String sname)
 * 4、带两个参数的Student(String sname,Date birth)
 */
public class Student {
    private Integer sid;
    private String sname;
    private Date birth;//出生日期
    private String sex;
    private BigDecimal sal;//首份薪资
    //幸运数字
    private Set<Integer> luckyNumber;
    //喜欢的名称
    private List<String> starts;
    //前任及Ta们的爱称
    private Map<String,String> lover;
    //喜欢的食物
    private String[] foods;
    //纪念日
    private Set<Date> days;

    private java.sql.Date inschool;//入学日期

    public java.sql.Date getInschool() {
        return inschool;
    }

    public void setInschool(java.sql.Date inschool) {
        this.inschool = inschool;
    }

    public Set<Date> getDays() {
        return days;
    }

    public void setDays(Set<Date> days) {
        this.days = days;
    }

    public Set<Integer> getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(Set<Integer> luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public List<String> getStarts() {
        return starts;
    }

    public void setStarts(List<String> starts) {
        this.starts = starts;
    }

    public Map<String, String> getLover() {
        return lover;
    }

    public void setLover(Map<String, String> lover) {
        this.lover = lover;
    }

    public String[] getFoods() {
        return foods;
    }

    public void setFoods(String[] foods) {
        this.foods = foods;
    }

    public Student(String sname, Date birth){
        this.sname = sname;
        this.birth =  birth;
        this.sid = -100;
        this.sex ="人妖";
        this.sal = new BigDecimal("1500");
        System.out.println("Student的带两个参数构造方法String,Date");
    }


    public  Student(Integer sid,String sname){
        System.out.println("Student的带两个参数的构造方法Integer,String");
        this.sid=sid;
        this.sname=sname;
        this.birth=new Date(2022-1900,9-1,23);
        this.sex="男";
        this.sal = new BigDecimal("8097");
    }
    public  Student(String sname,Integer sid){
        System.out.println("[String,Integer]Student的带两个参数的构造方法");
        this.sid=sid;
        this.sname=sname;
        this.birth=new Date(2022-1900,9-1,23);
        this.sex="男";
        this.sal = new BigDecimal("8097");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", birth=" + birth +
                ", sex='" + sex + '\'' +
                ", sal=" + sal +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Student() {
        System.out.println("Student无参哦****");
    }

    public Student(Integer sid, String sname, Date birth, String sex, BigDecimal sal) {
        System.out.println("Student全参构造****");
        this.sid = sid;
        this.sname = sname;
        this.birth = birth;
        this.sex = sex;
        this.sal = sal;
    }
}
