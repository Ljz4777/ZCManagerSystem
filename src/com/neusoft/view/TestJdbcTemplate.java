package com.neusoft.view;

import com.neusoft.db.DBManager;
import com.neusoft.db.JdbcTemplate;
import com.neusoft.entity.Guestbook;
import com.neusoft.mapping.EntityMapping;
import com.neusoft.mapping.MappingFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
        //查询
        //要从工厂类MappingFactory中获取Map集合中的对象
        MappingFactory mappingFactory =MappingFactory.getInstance();
        EntityMapping mapping = mappingFactory.getMapping(MappingFactory.GUESTBOOK_MAPPING);//GuestbookMapping
        List<Object> list = jt.query("select * from guestbook",mapping);
        for (int i = 0; i < list.size(); i++) {
            Guestbook gb = (Guestbook) list.get(i);
            System.out.println(gb.getName()+" "+gb.getPhone());
        }

    }
}
