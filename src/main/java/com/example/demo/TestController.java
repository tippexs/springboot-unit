
package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String index() {
        return "Hello From Spring Boot on Unit";
    }

    @RequestMapping("/*")
    public String test() {
        return "Hello From Spring Boot on Unit on CatchAll";
    }
}
