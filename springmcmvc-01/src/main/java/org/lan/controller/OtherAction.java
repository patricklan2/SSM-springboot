package org.lan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherAction {

    @RequestMapping("/other.action")
    String other(){
        System.out.println("other跳转");
        return "main";
    }
}
