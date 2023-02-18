package org.lan.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.lan.mapper.AccountMapper;
import org.lan.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
    @Resource(name = "accountMapper")
    AccountMapper accountMapper;

    @RequestMapping("/test")
    public String Test(HttpServletRequest request){
        System.out.println("this is test");
        Account ac_01 = accountMapper.selectByPrimaryKey("ac_01");
        request.setAttribute("name",ac_01);
        return "main";
    }
}
