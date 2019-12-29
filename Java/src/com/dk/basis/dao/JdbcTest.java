package com.dk.basis.dao;

import java.util.List;

/**
 * @author DingKai
 * @version 1.0
 */
public class JdbcTest {
    public static void main(String[] args) {
        List<List> list;
        JdbcStatement jdbcStatement = JdbcStatement.getJdbcStatement();
        /*jdbcStatement.createDatabase("DingKay1");
        jdbcStatement.dropDatabase("DingKay1");
        list = jdbcStatement.showDatabases();
        System.out.println(list);*/
        jdbcStatement.useDatabase("test");
        list = jdbcStatement.viewStructure("t_dk");
        for (List o : list) {
            System.out.println(o);
        }
    }
}
