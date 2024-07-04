package com.vimemacs.controller;

import com.vimemacs.model.IceRole;
import com.vimemacs.service.IceRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author HWD
 * @date 2024/7/3 17:14
 */
@Controller
@RequestMapping("iceRole")
public class IceRoleController {
    @Resource
    private IceRoleService iceRoleService;
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") Integer id) {
        IceRole iceRole = iceRoleService.findById(id);
        System.out.println(iceRole.getId());
        System.out.println(iceRole.getName());
        return "success";
    }
}
