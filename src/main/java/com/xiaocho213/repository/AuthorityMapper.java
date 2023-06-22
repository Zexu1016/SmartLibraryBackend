package com.xiaocho213.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorityMapper {

    @Select("select borrowing_limit from authority where level = #{level}")
    public Integer selectBorrowingLimitByLevel(Integer level);


}
