package com.xiaocho213.service.impl;

import com.xiaocho213.common.utils.BookStatus;
import com.xiaocho213.controller.request.BorrowBookDTO;
import com.xiaocho213.controller.request.ReturnBookDTO;
import com.xiaocho213.repository.AuthorityMapper;
import com.xiaocho213.repository.BorrowMapper;
import com.xiaocho213.repository.UserMapper;
import com.xiaocho213.repository.entity.Borrow;
import com.xiaocho213.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {
    private final BorrowMapper borrowMapper;
    private final UserMapper userMapper;
    private final AuthorityMapper authorityMapper;

    @Override
    public Borrow selectById(Integer id) {
        return null;
    }

    @Override
    public Boolean borrowBook(BorrowBookDTO borrowBookDTO) {

        Integer memberId = borrowBookDTO.getMemberId();
        Integer Level = userMapper.selectLevelById(memberId);

        Integer borrowingLimit = authorityMapper.selectBorrowingLimitByLevel(Level);
//        Integer countByMemberId = borrowMapper.selectCountByMemberId(memberId);
        Integer borrowedCount = userMapper.selectBorrowedCountById(memberId);

        if (borrowedCount > borrowingLimit)
            return Boolean.FALSE;

        Borrow borrow = new Borrow();
        borrow.setBookId(borrowBookDTO.getBookId());
        borrow.setMemberId(borrowBookDTO.getMemberId());
        borrow.setBorrowTime(new Timestamp(System.currentTimeMillis()));
        borrow.setStatues(BookStatus.BORROWED);

        borrowMapper.insert(borrow);

        userMapper.increaseBorrowedCountById(memberId);
        return Boolean.TRUE;
    }

    @Override
    public Boolean returnBook(ReturnBookDTO returnBookDTO) {

        Borrow borrow = borrowMapper.selectByBookId(returnBookDTO.getBookId());

        //TODO 校验是否把书放在正确的位置上


        userMapper.decreaseBorrowedCountById(borrow.getMemberId());
        borrowMapper.changeBorrowStatus(borrow.getId(), BookStatus.RETURNED);
        return Boolean.TRUE;
    }
}
