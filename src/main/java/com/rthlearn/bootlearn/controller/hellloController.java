package com.rthlearn.bootlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;

@RestController
public class hellloController {

    @RequestMapping("/hello")
    public String hello(String name){
        return "hello world123-----" + name ;
    }
}
