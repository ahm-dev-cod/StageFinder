package ma.stagefinder.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSwaggerController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
