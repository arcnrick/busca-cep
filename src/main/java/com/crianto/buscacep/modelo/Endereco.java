package com.crianto.buscacep.modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {

    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
}