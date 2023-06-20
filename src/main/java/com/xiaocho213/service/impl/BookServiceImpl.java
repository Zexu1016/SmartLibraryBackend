package com.xiaocho213.service.impl;

import com.xiaocho213.repository.BookMapper;
import com.xiaocho213.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;
}
