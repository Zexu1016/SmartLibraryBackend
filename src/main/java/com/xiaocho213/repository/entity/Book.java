package com.xiaocho213.repository.entity;


import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String press;
    private String location;
    private String type;
}
