package com.xiaocho213.repository.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Borrow {
    private Integer id;
    private Integer bookId;
    private Integer memberId;
    private Date borrowTime;

}
