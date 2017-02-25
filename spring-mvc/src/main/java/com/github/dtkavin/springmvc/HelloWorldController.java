package com.github.dtkavin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by john on 2/23/17.
 */
@Controller
@RequestMapping("springmvc")
public class HelloWorldController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Hello World");
        return "hello";
    }
}
