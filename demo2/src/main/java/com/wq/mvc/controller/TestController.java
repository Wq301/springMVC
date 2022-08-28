package com.wq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-09 20:31
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(
            value = {"/success","/hello","/user"},
            method={RequestMethod.POST},
            params = {"username","password=123456"}
    )
    public String success() {
        return "success";
    }
}