package com.fastcampuus.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    // 에러처리에 대한 제어권을 가져오기 위해서는 ErrorController를 구현해야함
    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
