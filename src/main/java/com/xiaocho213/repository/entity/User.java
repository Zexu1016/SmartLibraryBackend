package com.xiaocho213.repository.entity;


import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Integer id;
    private String name;
    private String gender;
    private Integer level;
    private Integer borrowedCount;
}
