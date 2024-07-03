package com.vimemacs.controller;

import com.vimemacs.model.IceSchool;
import com.vimemacs.service.IceSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author HWD
 * @date 2024/7/3 15:33
 */
@Controller
@RequestMapping("iceSchool")
public class IceSchoolController {
    @Resource
    private IceSchoolService iceSchoolService;
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") Integer id) {
        IceSchool iceSchool =  iceSchoolService.findById(id);
        System.out.println(iceSchool.getId());
        System.out.println(iceSchool.getName());
        return "success";
    }
}
