package com.knoldus.SpringBoot_91.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/message-jsp")
    public String messagejsp() {
        return "messageJsp";
    }
}
