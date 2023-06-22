package com.xiaocho213.service;

import com.xiaocho213.controller.request.BorrowBookDTO;
import com.xiaocho213.controller.request.ReturnBookDTO;
import com.xiaocho213.repository.entity.Borrow;

public interface BorrowService {
    public Borrow selectById(Integer id);

    public Boolean borrowBook(BorrowBookDTO borrowBookDTO);

    public Boolean returnBook(ReturnBookDTO returnBookDTO);
}
