package com.xiaocho213.service.impl;

import com.xiaocho213.controller.request.BorrowBookRequest;
import com.xiaocho213.repository.BorrowMapper;
import com.xiaocho213.repository.entity.Borrow;
import com.xiaocho213.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {
    private final BorrowMapper borrowMapper;

    @Override
    public Borrow selectById(Integer id) {
        return null;
    }

    @Override
    public Boolean borrowBook(BorrowBookRequest borrowBookRequest) {


        Borrow borrow = new Borrow();
        borrow.setBorrowTime(new Timestamp(System.currentTimeMillis()));
        borrow.setStatues("已借出");
        borrowMapper.insert(borrow);
        return null;
    }
}
