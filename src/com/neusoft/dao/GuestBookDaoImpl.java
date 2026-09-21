package com.neusoft.dao;

import com.neusoft.db.DBManager;
import com.neusoft.entity.Guestbook;
import com.neusoft.mapping.EntityMapping;
import com.neusoft.mapping.GuestbookMapping;

import java.util.List;

public class GuestBookDaoImpl implements GuestbookDao{



    @Override
    /**
     * select content from guestbook;
     */
    public List<String> getAllContent() {
        return null;
    }

    @Override
    /**
     * select content from guestbook where id == id;
     */
    public void getContentById(int id) {

    }

    @Override
    /**
     * update content from guestbook value content where id == id;
     */
    public void updateContentById(int id,String content) {

    }

    @Override
    /**
     * insert content from guestbook value content where id == id;
     */
    public void addContentById(int id,String content) {

    }

    @Override
    /**
     * delete content from guestbook where id == id;
     */
    public void deleteContentById(int id) {

    }
}
