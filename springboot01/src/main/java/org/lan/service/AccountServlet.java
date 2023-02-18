package org.lan.service;

import org.lan.pojo.Account;

import java.util.List;

public interface AccountServlet {
    int insert(Account account);

    List<Account> selectAll();
}
