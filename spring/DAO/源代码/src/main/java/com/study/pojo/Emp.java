package com.study.pojo;

import java.math.BigDecimal;
import java.sql.Date;

public class Emp {
    private Integer empno;//员工编号
    private String ename;//员工名称
    private BigDecimal sal;//薪水
    private BigDecimal comm;//津贴
    private Date hiredate;//入职日期
    private Integer mgr;//上级编号
    private String job;//职位
    private Integer deptno;//部门编号

    //添加临时字段。setter和getter方法
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", hiredate=" + hiredate +
                ", mgr=" + mgr +
                ", job='" + job + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Emp() {
    }

    public Emp(Integer empno, String ename, BigDecimal sal, BigDecimal comm, Date hiredate, Integer mgr, String job, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.comm = comm;
        this.hiredate = hiredate;
        this.mgr = mgr;
        this.job = job;
        this.deptno = deptno;
    }
}
