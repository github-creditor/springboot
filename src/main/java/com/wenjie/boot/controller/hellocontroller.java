package com.wenjie.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody       /*表示这是将放回值返回给浏览器，而不是跳转页面*/
@Controller
    /*可以使用Restcontroller    相当于@controller和@responsebody的结合*/
public class hellocontroller {


    @RequestMapping("/hello")
    public String handle01(){

    return "hello,string boot2!";



    }





}
