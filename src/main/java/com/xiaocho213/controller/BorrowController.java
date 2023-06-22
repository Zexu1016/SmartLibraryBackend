package com.xiaocho213.controller;


import com.xiaocho213.controller.request.BorrowBookDTO;
import com.xiaocho213.controller.request.ReturnBookDTO;
import com.xiaocho213.controller.response.SlResult;
import com.xiaocho213.service.BorrowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrow")
@RequiredArgsConstructor
public class BorrowController {
    private final BorrowService borrowService;

    @PostMapping("/borrowBook")
    public SlResult<Boolean> borrowBook(@RequestBody BorrowBookDTO borrowBookDTO) {
        return SlResult.success(borrowService.borrowBook(borrowBookDTO));
    }

    @PostMapping("/returnBook")
    public SlResult<Boolean> returnBook(@RequestBody ReturnBookDTO returnBookDTO) {
        return SlResult.success(borrowService.returnBook(returnBookDTO));
    }
}
