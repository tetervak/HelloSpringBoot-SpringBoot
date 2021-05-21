package sheridan.tetervak.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String hello(@RequestParam String name, Model model){

        model.addAttribute("name", name);
        return "Hello";
    }

}
