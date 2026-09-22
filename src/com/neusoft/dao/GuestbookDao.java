package com.neusoft.dao;

import com.neusoft.entity.Guestbook;

import java.sql.SQLException;
import java.util.List;

public interface GuestbookDao {
    /**
     * 查询所有留言
     * @return
     */
    public List<Object> queryAll();

    /**
     * 根据ID查询留言
     * @param id
     * @return
     */
    public Guestbook queryById(int id);

    /**
     * 修改留言
     * @param gb
     * @return
     */
    public boolean update(Guestbook gb);

    /**
     * 添加留言
     * @param gb
     * @return
     */
    public boolean insert(Guestbook gb) throws SQLException;

    /**
     * 根据ID删除留言
     * @param id
     * @return
     */
    public boolean delete(int id);
}
