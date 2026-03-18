package br.itb.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        String mensagem = "Olá, INF3AM";
        return mensagem;
    }

    @GetMapping("/ola/{nome}")
    public String ola(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }

    @GetMapping("/acesso/{email}")
    public String acesso(@PathVariable String email) {
        return "Acesso liberado, " + email + "!";
    }

    @GetMapping("/mensagem")
    public String getMethodName(@RequestParam String texto) {
        return "Mensagem: " + texto;
    }
    

}
