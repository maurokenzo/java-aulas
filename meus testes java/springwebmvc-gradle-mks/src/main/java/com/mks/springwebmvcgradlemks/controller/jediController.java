package com.mks.springwebmvcgradlemks.controller;
// dependências spring boot: Spring Web e Thymeleaf

import com.mks.springwebmvcgradlemks.model.Jedi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController

@Controller //Anotação para que a classe seja um controller
            // o spring passa a controlar as instâncias de controllers

public class jediController {

    @GetMapping("/jedi") // Anotação para quando usuário fizer
                         // requisição em /jedi


    public String jedi() {
        return "jedi"; // reenderiza o página jedi.html que está
                       // em resources/templates
    }

    @GetMapping("/curso")
    public String curso() {
        return "curso";
    }

    /*
    public String olaMensagem() {
        return "Oi eu sou a Bia do voley. Eu estou feliz";
        // retorna a String no navegador
    } */ // ATENÇÃO metodo usado com @RestController


}
