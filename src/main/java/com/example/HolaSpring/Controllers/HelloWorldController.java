package com.example.HolaSpring.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "hola";
    }
}
