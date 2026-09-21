package com.neusoft.dao;

import com.neusoft.entity.Guestbook;
import com.neusoft.mapping.MappingFactory;

public class GuestBookDaoImpl implements GuestbookDao{
    Guestbook  guestbook = new Guestbook();

    public int countId(){
        return 0;
    }

    @Override
    /**
     * select content from guestbook;
     */
    public void getAllContent() {

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
