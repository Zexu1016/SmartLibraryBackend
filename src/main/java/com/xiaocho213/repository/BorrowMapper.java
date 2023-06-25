package com.xiaocho213.repository;


import com.xiaocho213.repository.entity.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BorrowMapper {

    @Select("SELECT * FROM borrow WHERE id = #{id}")
    public Borrow selectById(Integer id);

    @Insert("INSERT INTO borrow (book_id, member_id, borrow_Time, status) " +
            "VALUE (#{bookId}, #{memberId}, #{borrowTime}, #{status})")
    public Boolean insert(Borrow borrow);

    @Select("SELECT COUNT(member_id) FROM borrow WHERE member_id = #{memberId}")
    public Integer selectCountByMemberId(Integer memberId);


    @Select("SELECT * FROM borrow WHERE book_id = #{bookId}")
    public Borrow selectByBookId(Integer bookId);

    @Update("UPDATE borrow SET status = #{status} WHERE id = #{id}")
    public Boolean changeBorrowStatus(Integer id , String status);
}
