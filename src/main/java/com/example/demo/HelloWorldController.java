package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        // O valor retornado é a resposta que será enviada ao navegador.
        return "Funcionou!!!!";
    }
      @PostMapping("/Hello")
    public String sayHelloPost() {
        return "Olá, mundo! (via POST)";
    }
}
