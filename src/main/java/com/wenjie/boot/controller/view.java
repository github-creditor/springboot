package com.wenjie.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class view {

    @RequestMapping("/test")
    public ModelAndView test(Model mo){
        Model model = mo.addAttribute("haha","hehe");
        mo.addAttribute("baidu","https://www.baidu.com");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");

        return modelAndView;

    }




}
