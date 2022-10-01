package org.study.annotation;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/* 对JDBC的封装
 * @author SMILE.Huang
 * @date 2022-04-04 15:12
 */
public class BaseDB {
	//三大对象
	private Connection conn;//连接对象
	private PreparedStatement stmt;//预编译执行对象
	private ResultSet rs;//结果集对象

	//四个字符串
	static final String driver="com.mysql.jdbc.Driver";
	final String url="jdbc:mysql://127.0.0.1:3306/test";
	final String username="root";
	final String password="123456";

	//一个静态块
	static{
		//加载驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动类未找到");
			e.printStackTrace();
		}
	}
	//获取连接
	private Connection getConn(){
		try {
			if(conn==null || conn.isClosed()){
				conn = DriverManager.getConnection(url,username,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	//关闭资源
	private void closeAll(){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//===============

	/**
	 * 执行增删改的方法
	 * @param sql
	 * @param param
	 * @return
	 */
	public Integer update(String sql,Object...param){
		try {
			//1、创建预编译执行对象
			stmt = getConn().prepareStatement(sql);
			//2、绑定参数
			if(param!=null && param.length>0){
				int i=1;
				for (Object o : param) {
					stmt.setObject(i++,o);
				}
			}
			//3、执行结果
			int i= stmt.executeUpdate();
			System.out.println("增删改语句是："+stmt);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();//关闭连接，释放资源
		}
		return -1;
	}

	/**
	 * 专门执行新增操作的方法，适用于主键自增的情况（主键是int类型）
	 * @param sql       新增的SQL语句
	 * @param param
	 * @return      自增的主键值
	 */
	public Integer insert(String sql,Object...param){
		Integer id = -1;
		try {
			//1、创建预编译执行对象
			stmt = getConn().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			//2、绑定参数
			if(param!=null && param.length>0){
				int i=1;
				for (Object o : param) {
					stmt.setObject(i++,o);
				}
			}
			//3、执行结果
			int i= stmt.executeUpdate();

			System.out.println("新增的语句："+stmt);
			rs = stmt.getGeneratedKeys();
			if(rs!=null && rs.next()){
				id = rs.getInt(1);
			}
			return id;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();//关闭连接，释放资源
		}
		return -1;
	}
	//执行查询的方法******
	//不变的部分Result-----》List，
	// 可变部分，里面查询字段，数据类型和数量都是可变的
	//接口的作用：将ResultSet中的一行数据，转换成集合里面的一个元素
	public <E> List<E> query(String sql,
							 RowMapper<E> mapper,
							 Object...param){
		try {
			//1、创建预编译执行对象，预编译sql语句
			stmt = getConn().prepareStatement(sql);
			//2、绑定参数
			if(param!=null && param.length>0){
				int i=1;
				for (Object o : param) {
					stmt.setObject(i++,o);
				}
			}
			//3、执行查询语句
			rs = stmt.executeQuery();
			System.out.println("查询SQL语句："+stmt);
			//4、声明集合
			List<E> list = new ArrayList<>();
			//5、获取游标对象中的值
			if(rs!=null){
				while(rs.next()){
					//RowMapper   记录--》对象
					E x = mapper.rowmap(rs);
					//将转换中会后得到的对象，存储到集合中
					list.add(x);
				}
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//关闭对象，释放资源
			closeAll();
		}
		return null;
	}
	//===============

	/**
	 * 统计总数
	 * @param sql   统计的SQL语句
	 * @param param
	 * @return
	 */
	public Integer count(String sql,Object...param){
		List<Integer> list = query(sql, new RowMapper<Integer>() {
			@Override
			public Integer rowmap(ResultSet rs) throws SQLException {
				return rs.getInt(1);
			}
		},param);
		return list.get(0);
	}
}
