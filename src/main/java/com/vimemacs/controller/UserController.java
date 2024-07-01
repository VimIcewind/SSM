package com.vimemacs.controller;

import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HWD
 * @date 2024/3/14 14:51
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("findAll")
    public String findAll(Model model) {
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getName());
        }
        return "hello";
    }
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") String id) {
        User user = userService.findById(id);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "hello";
    }
    
    @GetMapping("findByName")
    public String findByName(@RequestParam("name") String name) {
        List<User> userList = userService.findByName(name);
        for (User user : userList) {
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getName());
        }
        return "hello";
    }
}
