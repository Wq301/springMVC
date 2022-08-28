package com.wq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-16 0:52
 */
@Controller
public class TestInterceptor {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}