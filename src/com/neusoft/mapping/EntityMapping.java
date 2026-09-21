package com.neusoft.mapping;

import java.sql.ResultSet;

public interface EntityMapping {
    //定义一个抽象方法

    /**
     * 将结果集中的一行数据映射到一个Object对象上
     * @param rs
     * @return
     */
    public Object mapping(ResultSet rs);
}
