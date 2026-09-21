package com.neusoft.view;

import com.neusoft.db.DBManager;

public class TestDBManager {

    public static void main(String[] args) {
        //创建DBManager对象并调用静态方法
        DBManager dbManager = DBManager.getInstance();
        //连接数据库
        dbManager.getConnection();

    }

}
