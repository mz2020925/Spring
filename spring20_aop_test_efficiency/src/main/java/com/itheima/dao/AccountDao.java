package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Configuration;

import java.util.List;


public interface AccountDao {
    @Insert("insert into tbl_account (name, password) VALUES (#{name}, #{password})")
    void save(Account account);

    @Delete("delete from tbl_account where id=#{id}")
    void delete(Integer id);

    @Update("update tbl_account set name=#{name}, password=#{password} where id=#{id}")
    void update(Account account);

    @Select("select * from tbl_account")
    List<Account> selectAll();

    @Select("select * from tbl_account where id=#{id}")
    Account selectById(Integer id);
}
