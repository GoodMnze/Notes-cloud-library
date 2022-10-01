package org.study.annotation;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 行映射接口
 * 目的：将数据库的一行数据，转换成对应的一个实体类对象
 */
public interface RowMapper<T> {
    T rowmap(ResultSet rs) throws SQLException;
}
