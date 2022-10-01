package com.study.annotation.generateSQL;

import com.sun.org.glassfish.external.arc.Taxonomy;

import java.sql.Timestamp;

/* 考勤表
    1、私有的属性
    2、公开的setter和getter方法
    3、全参和无参构造方法
    4、toString()\hashCode()\equals()
 * @author SMILE.Huang
 * @date 2021-04-06 15:52
 */
@Table(value = "kq")
public class KaoQin {
    private Timestamp time;
    private String name;
    @Id
    private Integer kid;
    private Integer result;

    @Override
    public String toString() {
        return "KaoQin{" +
                "kid=" + kid +
                ", time=" + time +
                ", name='" + name + '\'' +
                ", result=" + result +
                '}';
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public KaoQin() {
    }

    public KaoQin(Integer kid, Timestamp time, String name, Integer result) {
        this.kid = kid;
        this.time = time;
        this.name = name;
        this.result = result;
    }
}
