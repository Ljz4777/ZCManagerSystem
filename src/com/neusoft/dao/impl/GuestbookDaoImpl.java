package com.neusoft.dao.impl;

import com.neusoft.dao.GuestbookDao;
import com.neusoft.entity.Guestbook;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GuestbookDaoImpl extends BaseDao implements GuestbookDao {

    @Override
    public List<Object> queryAll() {
        return List.of();
    }

    @Override
    public Guestbook queryById(int id) {
        return null;
    }

    @Override
    public boolean update(Guestbook gb) {
        return false;
    }

    public static void main(String[] args) {

        try {
            GuestbookDao dao = new GuestbookDaoImpl();
            Guestbook gb = new Guestbook();
            gb.setName("xyz");
            gb.setPhone("18976543657");
            gb.setEmail("xyz@gmail.com");
            gb.setTitle("title");
            gb.setContent("content");
            Date now = new Date(); //系统日期时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//日期的格式
            String nowStr = sdf.format(now);//将日期类型转换为String
            gb.setCreatetime(nowStr);
            boolean isRight = dao.insert(gb); //添加留言
            if (isRight) {
                System.out.println("add success......");
            }else {
                System.out.println("add failed......");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public boolean insert(Guestbook gb) throws SQLException {
        String SQL = "insert into guestbook(name,phone,email,title,content,createtime) " +
                "values(?,?,?,?,?,?)";
        int isRight = jt.update(SQL,
                gb.getName(),gb.getPhone(),gb.getEmail(),gb.getTitle(),
                gb.getContent(),gb.getCreatetime());
        return isRight == 1;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
