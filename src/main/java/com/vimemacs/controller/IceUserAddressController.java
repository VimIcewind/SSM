package com.vimemacs.controller;

import com.vimemacs.model.IceUserAddress;
import com.vimemacs.model.User;
import com.vimemacs.service.IceUserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author HWD
 * @date 2024/7/3 11:32
 */
@Controller
@RequestMapping("iceUserAddress")
public class IceUserAddressController {
    @Resource
    private IceUserAddressService iceUserAddressService;
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") Integer id) {
        IceUserAddress iceUserAddress = iceUserAddressService.findById(id);
        System.out.println(iceUserAddress.getId());
        System.out.println(iceUserAddress.getName());
        return "success";
    }

}
