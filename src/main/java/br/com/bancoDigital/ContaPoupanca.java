package br.com.bancoDigital;

public class ContaPoupanca extends Conta{

    protected ContaPoupanca(Cliente cliente) {
        super(cliente, TipoConta.CONTAPOUPANCA);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Poupança *** ");
        super.imprimirInformacoesComuns();


    }




}
