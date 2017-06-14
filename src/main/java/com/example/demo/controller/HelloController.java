package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wgl on 6/14/17.
 */
@Controller
public class HelloController {

    @Value("${demo.userName}")
    private String userName;

    @Value("${demo.bookTitle}")
    private String bookTitle;

    @Value("${com.demo.random.test2}")
    private Integer randomInt;

    @Value("${com.demo.random.str}")
    private String randomStr;

    @RequestMapping("")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("name", userName);
        map.addAttribute("bookTitle", bookTitle);
        map.addAttribute("randomInt", randomInt);
        map.addAttribute("randomStr", randomStr);
        // return模板文件的名称，对应src/main/resources/templates/welcome.html
        return "welcome";
    }
}