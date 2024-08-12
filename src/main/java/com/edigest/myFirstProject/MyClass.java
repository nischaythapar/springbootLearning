package com.edigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("abc")
    //this is how we create an api or controller
    //now whenever the user clicks on the localhost 8080/abc then hello
    //will be printed
    public String sayHello(){
        return "Hello";
    }
}
