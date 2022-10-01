package com.study.annotation.generateSQL;

import java.sql.Date;

/*
 * @author SMILE.Huang
 * @date 2021-04-06 15:57
 */
@Table
public class Employee {
    private String ename;
    private String job;
    @Id(name = "emp_no")
    private Integer empno;
    private Date hiredate;

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Employee() {
    }

    public Employee(Integer empno, String ename, String job, Date hiredate) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
    }
}
