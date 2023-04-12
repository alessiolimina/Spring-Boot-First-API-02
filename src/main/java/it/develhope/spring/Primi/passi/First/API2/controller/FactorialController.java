package it.develhope.spring.Primi.passi.First.API2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FactorialController {

    @GetMapping("/{n}")
    public String getFactorial(@PathVariable(required = false, value = "n") int n){
        long factorial = 1;
        for(int i = 1; i<=n; i++){
            factorial = factorial * i;
        }
        return "The " + n + " factorial is " + factorial;

    }

    //Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93Xu3knc
}

