package com.vimemacs.controller;

import com.vimemacs.model.IceUser;
import com.vimemacs.service.IceUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @GetMapping(value={"", "/page", "page*", "view/*", "**/msg"})
    public String hello(Model model) {
        model.addAttribute("message", "Hello SSM!");
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET)
    String get() {
        return "Hello from get";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    String delete() {
        return "Hello from delete";
    }

    @RequestMapping(method = RequestMethod.POST)
    String post() {
        return "Hello from post";
    }

    @RequestMapping(method = RequestMethod.PUT)
    String put() {
        return "Hello from put";
    }
    
    @RequestMapping(method = RequestMethod.PATCH)
    String patch() {
        return "Hello from patch";
    }

    @RequestMapping(value = "/produces", produces = {"applicatin/json"})
    String getProduces() {
        return "Produces attribute";
    }

    @RequestMapping(value = "/consumes", consumes = {"applicatin/json", "application/xml"})
    String getConsumes() {
        return "Consumes attribute";
    }
    
    @RequestMapping(value = "/head", headers = {"content-type=text/plain","content-type=text/html"})
    String head() {
        return "Mapping applied along with headers";
    }
    
    @RequestMapping(value = "/fetch", params = {"personId=10"})
    public String getParams(@RequestParam("personId") String id) {
        return "Fetched parameter using params attribute = " + id;
    }

    @RequestMapping(value = "/fetch", params = {"personId=20"})
    public String getParamsDifferent(@RequestParam("personId") String id) {
        return "Fetched parameter using params attribute = " + id;
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
