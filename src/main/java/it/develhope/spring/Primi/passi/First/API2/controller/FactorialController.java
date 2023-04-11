package it.develhope.spring.Primi.passi.First.API2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FactorialController {

    @GetMapping("/")
    public String getFactorial(@RequestParam Integer n){
        long factorial = 1;
        for(int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        return "the " + n + " factorial is " + factorial;

    }

    //Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93Xu3knc
}

