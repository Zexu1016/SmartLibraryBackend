package com.xiaocho213.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    @Select("SELECT level FROM member WHERE id = #{id}")
    public Integer selectLevelById(Integer id);
}
