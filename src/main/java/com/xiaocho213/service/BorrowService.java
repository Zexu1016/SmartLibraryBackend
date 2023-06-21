package com.xiaocho213.service;

import com.xiaocho213.controller.request.BorrowBookRequest;
import com.xiaocho213.repository.entity.Borrow;

public interface BorrowService {
    public Borrow selectById(Integer id);

    public Boolean borrowBook(BorrowBookRequest borrowBookRequest);
}
