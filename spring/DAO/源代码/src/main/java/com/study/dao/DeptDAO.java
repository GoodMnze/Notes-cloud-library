package com.study.dao;

import com.study.pojo.Dept;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Spring DAO第一种实现方式：XML
 * 1、编写dao类，继承父类JdbcDaoSupport
 * 2、dao类中的方法，可以通过getJdbcTemplate方法获取注入好的JdbcTemplate对象
 *  前提条件是：在核心配置文件中，通过di注入实例化当前Bean对象，
 *              并注入JdbcTemplate对象
 */
public class DeptDAO extends JdbcDaoSupport {
    /**
     * 查询所有
     * @return
     */
    public List<Dept> selectAll(){
        String sql="select * from dept order by deptno desc";
        return getJdbcTemplate().
                query(sql,new BeanPropertyRowMapper<Dept>(Dept.class));
    }
}
