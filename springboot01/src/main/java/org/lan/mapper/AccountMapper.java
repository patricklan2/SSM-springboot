package org.lan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.lan.pojo.Account;

// @Mapper
public interface AccountMapper {
    int deleteByPrimaryKey(String id);

    int insert(Account row);

    Account selectByPrimaryKey(String id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account row);
}