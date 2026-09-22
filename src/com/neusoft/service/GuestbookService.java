package com.neusoft.service;

import com.neusoft.entity.Guestbook;

import java.sql.SQLException;

public interface GuestbookService {
    public boolean add(Guestbook gb) throws SQLException;

    public boolean delete(Guestbook gb);

    public boolean update(Guestbook gb);

    public boolean query(Guestbook gb);
}
