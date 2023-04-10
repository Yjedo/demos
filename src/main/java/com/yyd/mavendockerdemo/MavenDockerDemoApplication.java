package com.yyd.mavendockerdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenDockerDemoApplication {

    @Value("${test.data}")
    private String data;


    public static void main(String[] args) {
        SpringApplication.run(MavenDockerDemoApplication.class, args);
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello, world!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return this.data;
    }

}
