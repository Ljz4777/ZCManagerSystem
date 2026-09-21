package com.neusoft.dao;

import com.neusoft.db.DBManager;
import com.neusoft.db.JdbcTemplate;
import com.neusoft.entity.Guestbook;
import com.neusoft.mapping.EntityMapping;
import com.neusoft.mapping.GuestbookMapping;
import com.neusoft.mapping.MappingFactory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class GuestBookDaoImpl implements GuestbookDao{
    //连接数据库
    private Connection connection;
    private JdbcTemplate jdbcTemplate = JdbcTemplate.getInstance();
    public GuestBookDaoImpl(){
        connection = DBManager.getInstance().getConnection();
        jdbcTemplate.setConnection(connection);
    }


    @Override
    /**
     * select content from guestbook;
     */
    public List<String> getAllContent() {
        List<String> contentList = new ArrayList<>();
        EntityMapping mapping = MappingFactory.getInstance().getMapping(MappingFactory.GUESTBOOK_MAPPING);
        List<Object> list = jdbcTemplate.query("select * from guestbook",mapping);
        for(Object obj:list){
            Guestbook guestbook = new Guestbook();
            contentList.add(guestbook.getContent());
        }
        return contentList;
    }

    @Override
    /**
     * select content from guestbook where id == id;
     */
    public List<String> getContentById(int id) {
        List<String> contentList = new ArrayList<>();
        EntityMapping mapping = MappingFactory.getInstance().getMapping(MappingFactory.GUESTBOOK_MAPPING);
        List<Object> list = jdbcTemplate.query("select * from guestbook where id == ?;",mapping,id);
        for(Object obj:list){
            Guestbook guestbook = new Guestbook();
            contentList.add(guestbook.getContent());
        }
        return contentList;
    }

    @Override
    /**
     * update content from guestbook value content where id == id;
     */
    public void updateContentById(int id,String content) {
        EntityMapping mapping = MappingFactory.getInstance().getMapping(MappingFactory.GUESTBOOK_MAPPING);
        jdbcTemplate.update("update content from guestbook values ? where id == ?",content,id);
    }

    @Override
    /**
     * insert content from guestbook value content where id == id;
     */
    public void addContentById(int id,String content) {
        EntityMapping mapping = MappingFactory.getInstance().getMapping(MappingFactory.GUESTBOOK_MAPPING);
        jdbcTemplate.update("insert content from guestbook values ? where id == ?",content,id);
    }

    @Override
    /**
     * delete content from guestbook where id == id;
     */
    public void deleteContentById(int id) {
        EntityMapping mapping = MappingFactory.getInstance().getMapping(MappingFactory.GUESTBOOK_MAPPING);
        jdbcTemplate.update("delete content from guestbook where id==?",id);
    }
}
