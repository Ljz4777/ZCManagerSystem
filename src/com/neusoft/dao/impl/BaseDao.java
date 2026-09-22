package com.neusoft.dao.impl;

import com.neusoft.db.JdbcTemplate;
import com.neusoft.mapping.MappingFactory;

import java.sql.Connection;

public class BaseDao {
    public JdbcTemplate jt = JdbcTemplate.getInstance();
    public MappingFactory mappingFactory = MappingFactory.getInstance();

    /**
     * 注入数据库连接
     * @param conn
     */
    public void setConnection(Connection conn) {
        jt.setConnection(conn);
    }

}
