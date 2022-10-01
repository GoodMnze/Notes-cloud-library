package com.study.dao;

import com.study.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Spring DAO的第二种方式：零配置+注解
 * 1、编写dao类，不要继承
 * 2、添加注解@Respository
 * 3、利用自动注解@AutoWried 注入JdbcTemplate对象
 */
@Repository
public class EmpDAO {
    @Autowired
    private JdbcTemplate template;

    //根据员工编号获取该员工的信息
    public Emp selectById(Integer empno){
        String sql ="select * from emp where empno=?";
        return template.queryForObject(sql,
                new BeanPropertyRowMapper<Emp>(Emp.class),
                empno);
    }
    //根据部门编号，查询员工的名字、职位和部门名字（两表联合查询）
    //分析：员工名字和职位都在Emp表。部门名字在Dept表
    //两种方式：queryForList   返回List<Map<String,Object>>
    //         query         自定义RowMapper接口。需要在Emp表中添加部门名称临时字段
    public List<Emp> selectByDeptNo(Integer deptno){
        //注意：列名如果重复了，需要添加前缀才能正常运行
        String sql="select ename,job,dname from emp " +
                "left join dept on emp.deptno=dept.deptno where dept.deptno=?";
        return template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                Emp emp = new Emp();
                emp.setEname(rs.getString("ename"));//员工名字
                emp.setJob(rs.getString("job"));//员工职位
                emp.setDname(rs.getString("dname"));//部门名称
                return emp;
            }
        },deptno);//不要忘记还有参数
    }

}
