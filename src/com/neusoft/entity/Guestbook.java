package com.neusoft.entity;

/**
 * Java Bean:Bean就是一个普通的Java类 也成为实体Bean 只包含get/set方法
 * 规则：
 *      类名------数据库的表明相同（首字母大写）
 *      属性------列名相同
 */

public class Guestbook {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String title;
    private String content;
    private String createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
