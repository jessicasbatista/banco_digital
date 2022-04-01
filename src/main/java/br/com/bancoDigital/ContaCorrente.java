package br.com.bancoDigital;

public class ContaCorrente extends Conta {

    protected ContaCorrente(Cliente cliente) {
        super(cliente, TipoConta.CONTACORRENTE);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Corrente *** ");
       super.imprimirInformacoesComuns();
    }
}
