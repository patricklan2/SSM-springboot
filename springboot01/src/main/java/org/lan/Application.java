package org.lan;

import jakarta.annotation.Resource;
import org.lan.mapper.AccountMapper;
import org.lan.pojo.Account;
import org.lan.pojo.User;
import org.lan.service.AccountServlet;
import org.lan.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"org.lan.mapper"})
public class Application {
//    @Resource(name = "accountMapper")
//    AccountMapper accountMapper;

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        UserService userService = ctx.getBean("userService", UserService.class);
//        userService.print("zhangsan");
//        User user = ctx.getBean("user", User.class);
//        System.out.println(user);
        AccountServlet accountService = ctx.getBean("accountService", AccountServlet.class);
//        List<Account> accounts = accountService.selectAll();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
//        Account account = new Account("ac_04", 50000);
//        accountService.insert(account);
    }
}
