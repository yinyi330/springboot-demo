package com.yinyispringbootdemo.controller;

import com.yinyispringbootdemo.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping("/testSwagger")
    @ApiOperation(value = "swagger测试")
    public String swagger(){
        return "hello, swagger!";
    }

    @GetMapping("/testToken")
    @ApiOperation(value = "swagger中token测试")
    public String token(HttpServletRequest httpServletRequest){
        //返回请求头中Authorization的值
        if(httpServletRequest.getHeader("Authorization") == null){
            return "Authorization is null";
        }
        return httpServletRequest.getHeader("Authorization");
    }

    @GetMapping("/testParams")
    @ApiOperation(value = "swagger中token测试")
    public String testParams(HttpServletRequest httpServletRequest, @RequestParam("name")String name){

        return  name+"你好！";
    }

    @PostMapping("/testJson")
    @ApiOperation(value = "swagger中token测试")
    public String testJson(HttpServletRequest httpServletRequest, @RequestBody User user){

        return  user.toString();
    }



}
