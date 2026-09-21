package com.neusoft.dao;

import java.util.List;

public interface GuestbookDao {
    /**
     * 查询所有的留言信息
     *
     * @return
     */
    public List<String> getAllContent();
    /**
     * 根据id查询某一条留言信息
     *
     * @return
     */
    public List<String> getContentById(int id);
    /**
     * 根据id修改留言信息
     */
    public void updateContentById(int id,String content);
    /**
     * 添加留言信息
     */
    public void addContentById(int id,String content);
    /**
     * 根据id删除留言信息
     */
    public void deleteContentById(int id);

}
