package com.vimemacs.controller;

import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
