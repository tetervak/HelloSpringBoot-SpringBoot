package sheridan.tetervak.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello";
    }

}
