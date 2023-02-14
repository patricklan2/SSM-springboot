package org.lan.mapper;

import java.util.List;
import org.lan.pojo.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(String id);

    int insert(Account row);

    Account selectByPrimaryKey(String id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account row);
}