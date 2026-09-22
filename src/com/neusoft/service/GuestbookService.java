package com.neusoft.service;

import com.neusoft.entity.Guestbook;

import java.sql.SQLException;

public interface GuestbookService {
    public boolean add(Guestbook gb) throws SQLException;
}
