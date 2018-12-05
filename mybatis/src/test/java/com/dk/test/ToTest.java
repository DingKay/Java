package com.dk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author DingKai
 * @Classname ToTest
 * @Description TODO
 * @create 2018-11-28
 */
public class ToTest {

    @Test
    public void deptTest() throws IOException {
        String resource="mybatis-config.xml";
        InputStream stream= Resources.getResourceAsStream(resource);
        //获得会话工厂
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(stream);
        //会话
        SqlSession session=sf.openSession();
        //01.弱类型  通过命名空间唯一锁定要执行的sql
        // List<Department> list = session.selectList("cn.happy.dao.getAllDept");
        //02.强类型
//        List<com.dk.mybatis.dao.Test> list = session.selectList("getAllTest");
//        for (com.dk.mybatis.dao.Test test : list) {
//            System.out.println(test.getName());
//        }
//        session.update("createTable");
//        com.dk.mybatis.dao.Test t = new com.dk.mybatis.dao.Test();
//        t.setTablename("t_hi");
//        int result = session.selectOne("getTable",t);
        int result = session.selectOne("getTable","t_hi");
        System.out.println("result = " + result);
    }

}
