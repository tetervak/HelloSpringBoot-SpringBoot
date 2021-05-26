package sheridan.tetervak.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @SuppressWarnings("SameReturnValue")
    @GetMapping("/Index")
    public String index(){
        return "Index";
    }

}
