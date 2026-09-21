package com.neusoft.view;

import com.neusoft.db.DBManager;
import com.neusoft.db.JdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;

public class TestJdbcTemplate {
    public static void main(String[] args) throws SQLException {
        //1.连接数据库
        DBManager dbManager = DBManager.getInstance();
        Connection connection = dbManager.getConnection();//连接数据库
        //2.获取模板的对象
        JdbcTemplate jt = JdbcTemplate.getInstance();
        //3.获取数据库的连接
        jt.setConnection(connection);//将DBManager中获取到的连接赋值给JdbcTemplate中的连接
        int isRight = jt.update("insert into guestbook(name,phone,email,title,content,createtime) values(?,?,?,?,?,?)",
                "solo","123456","emailsoloking@163.com","title","content","2026-09-21");
        //手动提交事务
        connection.commit();
        //connection.rollback();
        System.out.println(isRight);
    }
}
