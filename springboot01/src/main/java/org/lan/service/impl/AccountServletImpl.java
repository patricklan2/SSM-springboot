package org.lan.service.impl;

import jakarta.annotation.Resource;
import org.lan.mapper.AccountMapper;
import org.lan.pojo.Account;
import org.lan.service.AccountServlet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountService")
public class AccountServletImpl implements AccountServlet {
    @Resource
    AccountMapper accountMapper;

    @Transactional
    @Override
    public int insert(Account account) {
        int i = accountMapper.insert(account);
        //int j = 10/0;
        return i;
    }

    @Override
    public List<Account> selectAll() {
        return accountMapper.selectAll();
    }
}
