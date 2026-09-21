package com.neusoft.view;

import com.neusoft.db.DBManager;
import com.neusoft.db.JdbcTemplate;

import java.sql.Connection;

public class TestJdbcTemplate {
    public static void main(String[] args) {
        //1.连接数据库
        DBManager dbManager = DBManager.getInstance();
        Connection connection = dbManager.getConnection();//连接数据库
        //2.获取模板的对象
        JdbcTemplate jt = JdbcTemplate.getInstance();
        //3.获取数据库的连接
        jt.setConnection(connection);
        int isRight = jt.update("insert into guestbook(name,phone,email,title,content,createtime) values(?,?,?,?,?,?)",
                "soloking","123456","emailsoloking@163.com","title","content","2026-09-21");
        System.out.println(isRight);
    }
}
