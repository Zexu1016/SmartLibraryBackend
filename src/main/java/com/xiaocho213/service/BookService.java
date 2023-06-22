package com.xiaocho213.service;


import com.xiaocho213.controller.request.SearchBookDTO;
import com.xiaocho213.repository.entity.Book;

import java.util.List;


public interface BookService {

    public List<Book> searchBook(SearchBookDTO searchBookDTO);
}
