package com.crianto.buscacep.service;

import com.crianto.buscacep.cliente.EnderecoClient;
import com.crianto.buscacep.modelo.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoClient enderecoClient;

    public Endereco getEndereco(String cep) {
        return enderecoClient.getEndereco(cep);
    }
}