package com.mks.roberta.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRobertaController {
    @GetMapping("/")
    public String HelloMassage() {
        return "Olá tudo bem Roberta?";
    }

}
