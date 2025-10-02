package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/hello")
public class HelloWorldController {
    
    @GetMapping // URL final: .../hello
    public String sayHello() {
        return "API ATUALIZADA - Versão 2!!";
    }
    
    @PostMapping // URL final: .../hello
    public String sayHelloPost(@RequestBody Hellorobo dados) {
        String nomeRecebido = dados.getNome();
        return "Olá, " + nomeRecebido + "! (Recebido via POST)";
    }
}
