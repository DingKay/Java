package com.dk.basis.dao;

import java.util.List;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/5/30
 */
public class JdbcTest {
    public static void main(String[] args) {
        JdbcStatement jdbcStatement = JdbcStatement.getJdbcStatement();
//        jdbcStatement.createDatabase("DingKay1");
//        jdbcStatement.dropDatabase("DingKay1");
        List list = jdbcStatement.showDatabases();
        System.out.println(list);
    }
}
