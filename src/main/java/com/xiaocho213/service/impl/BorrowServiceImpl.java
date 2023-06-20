package com.xiaocho213.service.impl;

import com.xiaocho213.repository.BookMapper;
import com.xiaocho213.repository.entity.Borrow;
import com.xiaocho213.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {
    private final BorrowService borrowService;

    @Override
    public Borrow selcecById(Integer id) {
        return borrowService.selcecById(id);
    }
}
