package com.xiaocho213.service.impl;

import com.xiaocho213.controller.request.BorrowBookRequest;
import com.xiaocho213.repository.BookMapper;
import com.xiaocho213.repository.BorrowMapper;
import com.xiaocho213.repository.entity.Borrow;
import com.xiaocho213.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

        return null;
    }
}
