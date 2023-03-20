package com.develhope.Environments.Variables2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${myCustomVariableTree.welcomeMsg}")
    private String welcomeMsg;


    @GetMapping("/")
    public String getWelcomeMsg() {
        return welcomeMsg;
    }

}
