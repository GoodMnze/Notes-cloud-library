package com.study.pojo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/*1、XML方式
（1）将所有的DAO继承JdbcDaoSupport父类
（2）子类可以通过getJdbcTemplate()获取JdbcTemplate模板类对象
	* 需要在applicationContext.xml文件中，注入当前DAO的bean对象
	* 并使用setter注入方式，给 属性jdbcTemplate赋值
 * @author SMILE.Huang
 * @date 2020-07-16 15:08
 */
public class EmpDAO extends JdbcDaoSupport {
    /*查询所有*/
    public List<Emp> selectAll(){
        String sql="select * from emp order by empno desc";
        return getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper<Emp>(Emp.class));
    }
    /*根据主键查询员工信息*/
    public Emp selectById(Long empId){
        String sql="select * from emp where empno=?";
        return getJdbcTemplate().queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class),empId);
    }

    public Integer doInsert(Emp emp){
        String sql="insert into emp(empno,ename,job,sal,hiredate,deptno)" +
                " values(?,?,?,?,?,?)";
        return getJdbcTemplate().update(sql,
                emp.getEmpno(),
                emp.getEname(),
                emp.getJob(),
                emp.getSal(),
                emp.getHiredate(),
                emp.getDeptno());
    }
}
