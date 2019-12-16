package com.hxd.controller;

import com.hxd.domain.User;
import com.hxd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> list = userService.findAll();
        model.addAttribute("list",list);
        return "userList";


    }
}
