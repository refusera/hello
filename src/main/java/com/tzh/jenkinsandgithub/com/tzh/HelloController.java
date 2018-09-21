package com.tzh.jenkinsandgithub.com.tzh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return " Say Hello To The World " + new Date();
    }
}
