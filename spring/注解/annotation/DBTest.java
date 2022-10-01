package org.study.annotation;

import org.study.reflection.Dept;
import org.study.reflection.Emp;

import java.util.List;

public class DBTest {
    public static void main(String[] args) {
        BaseDAO<Emp> dao = new BaseDAO<>(Emp.class);
        List<Emp> query = dao.query("select empno,ename,sal,hiredate from emp");
        for (Object o : query) {
            System.out.println(o);
        }

//        Integer update = dao.update("delete from dept where deptno=?", 7);
//        System.out.println(update>0?"删除成功过":"删除失败");


    }
}


