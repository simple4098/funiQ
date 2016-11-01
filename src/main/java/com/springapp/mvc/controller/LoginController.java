package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DESC:
 * User: ZLin
 * Date: 14-10-12 Time: 下午2:08
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginView(){
        return "/login";
    }

    @RequestMapping(value = "/login.htm",method = RequestMethod.POST)
    public String login(){
        return "/login";
    }
}
