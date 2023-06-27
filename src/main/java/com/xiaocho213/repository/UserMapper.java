package com.xiaocho213.repository;


import com.xiaocho213.repository.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("SELECT level FROM user WHERE id = #{id}")
    public Integer selectLevelById(Integer id);

    @Select("SELECT borrowed_count FROM user WHERE id = #{id}")
    public Integer selectBorrowedCountById(Integer id);

    @Update("UPDATE user SET borrowed_count = borrowed_count + 1 WHERE id = #{id}")
    public Integer increaseBorrowedCountById(Integer id);

    @Update("UPDATE user SET borrowed_count = borrowed_count - 1 WHERE id = #{id}")
    public Integer decreaseBorrowedCountById(Integer id);

    @Select("SELECT * FROM user WHERE username = #{username}")
    public User selectByUsername(String username);
}
