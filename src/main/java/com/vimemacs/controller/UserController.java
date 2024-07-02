package com.vimemacs.controller;

import com.vimemacs.model.User;
import com.vimemacs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        return "success";
    }

    @GetMapping("findById")
    public String findById(@RequestParam("id") String id) {
        User user = userService.findById(id);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "success";
    }

    @GetMapping("findByIds")
    public String findByIds(Model model) {
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<User> userlist = userService.findByIds(ids);
        for (User user : userlist) {
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getName());
        }
        return "success";
    }
    
    @GetMapping("findByName")
    public String findByName(@RequestParam("name") String name) {
        List<User> userList = userService.findByName(name);
        for (User user : userList) {
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getName());
        }
        return "success";
    }

    @GetMapping("findByNameAndPassword")
    public String findByNameAndPassword(@RequestParam("name") String name, @RequestParam("password") String password) {
        List<User> userList = userService.findByNameAndPassword(name, password);
        for (User user : userList) {
            System.out.println("id: " + user.getId());
            System.out.println("name: " + user.getName());
        }
        return "success";
    }

    @GetMapping("countByName")
    public String countByName(@RequestParam("name") String name) {
        int count = userService.countByName(name);
        System.out.println(count);
        return "success";
    }
    
    @GetMapping("insert")
    public String insert(@ModelAttribute("user") User user) {
        int count = userService.insert(user);
        System.out.println(count);
        return "success";
    }
    
    @GetMapping("update")
    public String update(@ModelAttribute("user") User user) {
        int count = userService.update(user);
        System.out.println(count);
        return "success";
    }

    @GetMapping("delete")
    public String delete(@RequestParam("id") Integer id) {
        int count = userService.delete(id);
        System.out.println(count);
        return "success";
    }

    @GetMapping("deleteByName")
    public String deleteByName(@RequestParam("name") String name) {
        int count = userService.deleteByName(name);
        System.out.println(count);
        return "success";
    }
}
