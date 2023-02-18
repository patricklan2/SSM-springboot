package org.lan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSprintBoot {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSprintBoot(){
        return "Hello Spring boot";
    }

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount() {
        return "访问user/Account";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin() {
        return "访问user/login";
    }
}
