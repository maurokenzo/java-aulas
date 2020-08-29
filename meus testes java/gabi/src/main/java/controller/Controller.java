package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class Controller {

        @GetMapping("/")  //mapeia uma operação rest em um get, com um valor padrão "/" e então ao acessar
        public String helloMessage() {        // localhost:8080 irá mapear para retornar esse HelloMessage
            return "Eu sou a Gabi";
        }
    }


