package com.xiaocho213.repository.entity;


import lombok.Data;

import java.sql.Timestamp;


@Data
public class Borrow {
    private Integer id;
    private Integer bookId;
    private Integer memberId;
    private Timestamp borrowTime;
    private String statues;
}
