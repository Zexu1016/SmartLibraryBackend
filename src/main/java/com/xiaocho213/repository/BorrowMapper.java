package com.xiaocho213.repository;


import com.xiaocho213.repository.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BorrowMapper {

    @Select("SELECT * FROM borrow WHERE id = #{id}")
    public Borrow selectById(Integer id);


}
