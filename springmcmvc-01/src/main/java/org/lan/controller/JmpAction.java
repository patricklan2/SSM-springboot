package org.lan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JmpAction {
    /**
     * 功能由方法类执行
     * 1)访问权限public
     * 2)方法返回值任意
     */

    @RequestMapping("/jumpOne.action")
    public String jumpOne() {
        System.out.println("页面跳转");
        return "main";
    }

    @RequestMapping("/jumpTwo.action")
    public String jumpTwo() {
        System.out.println("页面跳转action");
        return "forward:/other.action";
    }

    @RequestMapping("/jumpThree.action")
    public String jumpThree() {
        System.out.println("页面重定向");
        return "redirect:/admin/main.jsp";
    }

    @RequestMapping("/jumpFour.action")
    public String jumpFour() {
        System.out.println("页面重定向action");
        return "redirect:/other.action";
    }
}
