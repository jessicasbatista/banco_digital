package br.com.bancoDigital;

import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Jessica");
        cliente.setTipo(Cliente.TipoPessoa.PESSOA_FISICA);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        Banco banco = new Banco();
        banco.setNome("Banco Brasil");
        banco.adicionaConta(cc);
        banco.adicionaConta(poupanca);

        cc.depositar(500);
        cc.transferir(200, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        banco.imprimirTodasContas();


    }
}
