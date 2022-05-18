package com.crianto.buscacep.controller;

import com.crianto.buscacep.modelo.Endereco;
import com.crianto.buscacep.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/viaCep")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public Endereco getEndereco(@PathVariable String cep) {
        return enderecoService.getEndereco(cep);
    }
}