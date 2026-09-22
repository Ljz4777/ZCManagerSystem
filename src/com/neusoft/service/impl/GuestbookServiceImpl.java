package com.neusoft.service.impl;

import com.neusoft.dao.GuestbookDao;
import com.neusoft.dao.impl.GuestbookDaoImpl;
import com.neusoft.db.DBManager;
import com.neusoft.entity.Guestbook;
import com.neusoft.service.GuestbookService;

import java.sql.Connection;
import java.sql.SQLException;

public class GuestbookServiceImpl implements GuestbookService {
    @Override
    public boolean add(Guestbook gb){
        boolean isRight = false;
        Connection connection = null;
        try {
            DBManager dbManager = DBManager.getInstance();
            connection = dbManager.getConnection();//连接数据库
            GuestbookDaoImpl guestbookDao = new GuestbookDaoImpl();
            //注入数据库的连接
            guestbookDao.setConnection(connection);
            isRight = guestbookDao.insert(gb);
            //处理事务 在三层结构中 事务的处理应该在业务service层
            connection.commit();
        } catch (SQLException e) {
            //回滚事务
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
        return isRight;
    }
}
