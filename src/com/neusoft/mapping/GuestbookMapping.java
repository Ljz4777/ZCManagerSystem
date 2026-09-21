package com.neusoft.mapping;

import com.neusoft.entity.Guestbook;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestbookMapping implements EntityMapping{

    @Override
    public Object mapping(ResultSet rs) throws SQLException {
        Guestbook guestbook = new Guestbook();
        guestbook.setId((rs.getInt("id")));
        guestbook.setName(rs.getString("name"));
        guestbook.setPhone(rs.getString("phone"));
        guestbook.setEmail(rs.getString("email"));
        guestbook.setTitle(rs.getString("title"));
        guestbook.setContent(rs.getString("content"));
        guestbook.setCreatetime(rs.getString("createtime"));
        return guestbook;
    }
}
