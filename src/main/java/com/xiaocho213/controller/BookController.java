package com.xiaocho213.controller;


import com.xiaocho213.controller.request.SearchBookDTO;
import com.xiaocho213.controller.response.SlResult;
import com.xiaocho213.repository.entity.Book;
import com.xiaocho213.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/search")
    public SlResult<List<Book>> searchBook(@RequestBody SearchBookDTO searchBookDTO) {
        return SlResult.success(bookService.searchBook(searchBookDTO));
    }

}
