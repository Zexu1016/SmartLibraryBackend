package com.xiaocho213.repository;

import com.xiaocho213.repository.entity.Authority;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorityMapper {

    @Select("select borrowing_limit from authority where level = #{level}")
    public Authority selectBorrowingLimitByLevel(Integer level);


}
