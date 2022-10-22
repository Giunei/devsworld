package com.devsworlds.core.service;

import com.devsworlds.core.controller.PessoaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    private PessoaController pessoaController;

    public void instanciaDB() {

    }
}
