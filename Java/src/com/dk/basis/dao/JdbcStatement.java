package com.dk.basis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/5/30
 */
public class JdbcStatement {
    /**
     * properties file path
     * C:\Users\dk\Documents\Project\Java\out\production\Java\com\dk\basis\dao
     * C:\Users\dk\Documents\Project\Java\out\production\Java\jdbcStatement
     */
    private final String FILE_PATH = "../../../../jdbc/database.properties";

    private Properties properties;

    /**
     * JdbcStatement single
     */
    private static JdbcStatement jdbcStatement = new JdbcStatement();

    private JdbcStatement() {
        try
        {
            InputStream inputStream = this.getClass().getResourceAsStream(FILE_PATH);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String url, user, pwd;
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            pwd = properties.getProperty("password");
            this.connection = DriverManager.getConnection(url, user, pwd);
            this.statement = this.connection.createStatement();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * get JdbcStatement instance
     */
    public static JdbcStatement getJdbcStatement()
    {
        return jdbcStatement;
    }

    /**
     * database connection
     */
    private Connection connection;

    /**
     * statement
     */
    private Statement statement;

    /**
     * create database in mysql
     * @author DingKai
     * @date 2019/5/30
     * @param dbName
     * @return boolean
     * @throws SQLException sql is incorrect
     */
    public boolean createDatabase(String dbName)
    {
        boolean result = false;
        try {
            long s = System.currentTimeMillis();
            int i = statement.executeUpdate("create database " + dbName);
            long e = System.currentTimeMillis() - s;
            System.out.println(e);
            if (i > 0)
            {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * delete database for existed in mysql
     * @author DingKai
     * @date 2019/5/30
     * @param dbName
     * @return boolean
     * @throws SQLException sql is incorrect
     */
    public boolean dropDatabase(String dbName)
    {
        boolean result = false;
        try {
            long s = System.currentTimeMillis();
            int i = statement.executeUpdate("drop database " + dbName);
            long e = System.currentTimeMillis() - s;
            System.out.println(e);
            if (i > 0)
            {
                result = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * change current database
     */
    public void useDatabase(String dbName)
    {
        try {
            statement.executeUpdate("use " + dbName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * show all database
     */
    public List<String> showDatabases()
    {
        List list = new ArrayList();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("show databases;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<List> viewStructure(String tableName)
    {
        List<List> list = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("desc " + tableName);
            List<String> column = new ArrayList<>();
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                column.add(metaData.getColumnName(i));
            }
            list.add(column);
            while (resultSet.next()) {
                List<String> l = new ArrayList<>();
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    l.add(resultSet.getString(i));
                }
                list.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
