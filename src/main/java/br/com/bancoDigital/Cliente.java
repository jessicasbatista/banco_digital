package br.com.bancoDigital;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    public enum TipoPessoa {PESSOA_FISICA, PESSOA_JURIDICA}

    protected int codigo;
    protected String nome;
    protected String documento;
    protected TipoPessoa tipo;
}

