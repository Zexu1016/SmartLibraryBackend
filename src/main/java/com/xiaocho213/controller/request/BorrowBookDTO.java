package com.xiaocho213.controller.request;

import lombok.Data;

@Data
public class BorrowBookDTO {
    private Integer id;
    private Integer bookId;
    private Integer memberId;
}
