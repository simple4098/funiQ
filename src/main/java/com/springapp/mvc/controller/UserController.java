package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Users;
import com.springapp.mvc.service.IUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by LinHuan on 14-4-30.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUsersService usersService;

    @RequestMapping("/list")
    public String selectAll(Model model){
        model.addAttribute("userList",usersService.selectAll());
        return  "/list";
    }
    @RequestMapping("/save")
    public String save(String name,String address){
        Users users=new Users();
        users.setName(name);
        users.setAddress(address);
        usersService.save(users);
        return   "redirect:/list";
    }
}
