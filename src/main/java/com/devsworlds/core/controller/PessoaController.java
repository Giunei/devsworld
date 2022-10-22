package com.devsworlds.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @GetMapping(value = "/{id}")
    private String teste(@PathVariable int id) {
        return "aaaaaaaaa";
    }
}
