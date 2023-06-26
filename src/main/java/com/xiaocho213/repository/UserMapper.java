package com.xiaocho213.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("SELECT level FROM member WHERE id = #{id}")
    public Integer selectLevelById(Integer id);

    @Select("SELECT borrowed_count FROM member WHERE id = #{id}")
    public Integer selectBorrowedCountById(Integer id);

    @Update("UPDATE member SET borrowed_count = borrowed_count + 1 WHERE id = #{id}")
    public Integer increaseBorrowedCountById(Integer id);

    @Update("UPDATE member SET borrowed_count = borrowed_count - 1 WHERE id = #{id}")
    public Integer decreaseBorrowedCountById(Integer id);
}
