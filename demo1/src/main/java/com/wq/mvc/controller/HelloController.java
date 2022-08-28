package com.wq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-09 10:16
 */
@Controller
public class HelloController {
    //"/"----》/WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index(){
        return "index";    //返回视图名称
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}