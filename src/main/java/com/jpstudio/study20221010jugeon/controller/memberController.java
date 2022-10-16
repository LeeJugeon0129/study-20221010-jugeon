package com.jpstudio.study20221010jugeon.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    @GetMapping("/member/login")
    public String login(){
        return "/member/login";
    }

    @GetMapping("/member/signup")
    public String signUp(){
        return "/member/signup";
    }

    @GetMapping("/member/details")
    public String details(){
        return "/member/Details";
    }

    @GetMapping("/member/review")
    public String review(){
        return "/member/review";
    }

    @GetMapping("/member/review-list")
    public String reviewList(){
        return "/member/review-list";
    }

}
