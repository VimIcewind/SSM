package com.vimemacs.controller;

import com.vimemacs.model.IceStudent;
import com.vimemacs.service.IceStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HWD
 * @date 2024/7/3 15:38
 */
@Controller
@RequestMapping("iceStudent")
public class IceStudentController {
    @Resource
    private IceStudentService iceStudentService;
    
    @GetMapping("findById")
    public String findById(@RequestParam("id") Integer id) {
        IceStudent iceStudent = iceStudentService.findById(id);
        System.out.println(iceStudent.getId());
        System.out.println(iceStudent.getName());
        System.out.println(iceStudent.getAge());
        System.out.println(iceStudent.getIceSchool());
        return "success";
    }

    @GetMapping("findBySchoolId")
    public String findBySchoolId(@RequestParam("schoolId") Integer schoolId) {
        List<IceStudent> iceStudents = iceStudentService.findBySchoolId(schoolId);
        for (IceStudent iceStudent : iceStudents) {
            System.out.println(iceStudent.getId());
            System.out.println(iceStudent.getName());
            System.out.println(iceStudent.getAge());
        }
        return "success";
    }
}
