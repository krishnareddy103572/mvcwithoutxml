package com.krishna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KrishnaController {

    @RequestMapping("/welcome")
    @ResponseBody

    // Method
    public String helloGfg()
    {
        return "Welcome to Krishna's Restaurant :)!";
    }
}
