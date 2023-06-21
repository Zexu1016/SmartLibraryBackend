package com.xiaocho213.repository;


import com.xiaocho213.repository.entity.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BorrowMapper {

    @Select("SELECT * FROM borrow WHERE id = #{id}")
    public Borrow selectById(Integer id);

    @Insert("INSERT INTO borrow (book_id, member_id, borrow_Time, status) " +
            "VALUE (#{bookId}, #{memberId}, #{borrowTime}, #{status})")
    public Boolean insert(Borrow borrow);
}
