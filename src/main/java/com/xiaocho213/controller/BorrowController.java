package com.xiaocho213.controller;


import com.xiaocho213.controller.request.BorrowBookRequest;
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
    public SlResult<Boolean> borrowBook(@RequestBody BorrowBookRequest borrowBookRequest) {
        return SlResult.success(borrowService.borrowBook(borrowBookRequest));
    }

}
