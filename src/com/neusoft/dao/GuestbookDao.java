package com.neusoft.dao;

public interface GuestbookDao {
    /**
     * 查询所有的留言信息
     */
    public void getAllContent();
    /**
     * 根据id查询某一条留言信息
     */
    public void getContentById(int id);
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
