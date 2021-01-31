package com.wenjie.boot.controller;

import com.wenjie.boot.bean.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class TestYaml {

    @Autowired
    Persion per;


    @RequestMapping("/he")
    public Persion per(){

        System.out.println(per);
        return per;
    }

}
