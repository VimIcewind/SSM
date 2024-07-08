package com.vimemacs.controller;

import com.vimemacs.model.IceUser;
import com.vimemacs.service.IceUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author HWD
 * @date 2024/7/3 11:37
 */
@Controller
@RequestMapping("iceUser")
public class IceUserController {
    @Resource
    private IceUserService iceUserService;
    
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello SSM!");
        return "hello";
    }
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") Integer id) {
        IceUser iceUser = iceUserService.findById(id);
        System.out.println(iceUser.getId());
        System.out.println(iceUser.getName());
        System.out.println(iceUser.getAge());
        System.out.println(iceUser.getIceUserAddress().getId());
        System.out.println(iceUser.getIceUserAddress().getName());
        return "success";
    }
}
