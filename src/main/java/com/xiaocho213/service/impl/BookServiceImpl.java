package com.xiaocho213.service.impl;

import com.xiaocho213.controller.request.SearchBookDTO;
import com.xiaocho213.repository.BookMapper;
import com.xiaocho213.repository.entity.Book;
import com.xiaocho213.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;

    @Override
    public List<Book> searchBook(SearchBookDTO searchBookDTO) {
        //TODO 尚未完成
        return null;
    }
}
