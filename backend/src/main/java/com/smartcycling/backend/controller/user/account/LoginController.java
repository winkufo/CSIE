package com.smartcycling.backend.controller.user.account;

import com.smartcycling.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String,String> getToken(@RequestParam Map<String,String> map){
        String username = map.get("username");
        String password = map.get("password");
        System.out.println("login:"+map.toString());
        System.out.println("loading");
        return loginService.getToken(username,password);

    }


}