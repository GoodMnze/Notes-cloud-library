package com.study.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/*/* 2、0配置方式+注解方式
（1）XML中配置JdbcTemplate对象及所需资源、以及零配置扫描器
（2）编写DAO类，不需要继承任何父类，但是一定要添加注解@Repository
（3）在DAO类，通过注解@Autowired注入JdbcTemplate模板对象
* @author SMILE.Huang
* @date 2020-06-19 16:09
* 零配置扫描器中的四个Bean对象注解，用于自动注入
* 1、@Component 普通的bean的注解
* 2、@Repository 用于注解DAO类
* 3、@Services 用于注解Services类
* 4、@Controller 用户注解Controller
*
* 零配置扫描中如何获取已经注入好的对象：
* 1、@Autowired
  2、@Qualifier
 * @author SMILE.Huang
 * @date 2020-07-16 16:03
 */
@Repository()
public class DeptDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    /*根据部门编号查询部门信息*/
    public Dept selectById(Long deptno){
        String sql="select * from dept where deptno=?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Dept.class),
                deptno);
    }
}
