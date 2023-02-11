package org.lan.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitAction {

    @RequestMapping("/one.action")
    public String one(String name,int age) {
        System.out.println("name:" + name + " age:" + age);
        return "main";
    }

    @RequestMapping("/two.action")
    public String two(User user) {
        System.out.println(user);
        return "main";
    }

    @RequestMapping("/three/{name}/{age}.action")
    public String three(@PathVariable String name,@PathVariable int age) {
        System.out.println("name:" + name + " age:" + age);
        return "main";
    }

    @RequestMapping("/four.action")
    public String four(@RequestParam("name") String userName, @RequestParam("age") int age) {
        System.out.println("name:" + userName + " age:" + age);
        return "main";
    }

    @RequestMapping("/five.action")
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name:" + name + " age:" + age);
        return "main";
    }
}
