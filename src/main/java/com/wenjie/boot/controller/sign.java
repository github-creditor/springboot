package com.wenjie.boot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")
public class sign {


    @RequestMapping("/sign01")
    public ModelAndView sign(@RequestParam("username") String user, String Password,Model mo){
        ModelAndView modelAndView = new ModelAndView();

        if (StringUtils.isEmpty(user)&&StringUtils.isEmpty(Password)){

            modelAndView.setViewName("redirect:/sign");
        }else {
            mo.addAttribute("user",user);
            modelAndView.setViewName("redirect:/success.html");
        }

        return modelAndView;

    }

    @RequestMapping(value = {"/","/sign"})
    public String signtest(){
        return "sign";
    }


    @RequestMapping("/success.html")
    public String succeessTest(HttpSession session){
        String us=(String)session.getAttribute("user");
        if (us.length()==0){
            return "redirect:/sign";
        }else {
            return "success";
        }

    }
}
