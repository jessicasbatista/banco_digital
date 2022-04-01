package br.com.bancoDigital;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {

   protected List<Conta> contas = new ArrayList<>();
    protected String nome;

    void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }

    protected void imprimirTodasContas(){
        System.out.println("*** Contas cadastradas ***");
        this.contas.forEach(c -> System.out.printf("Numero conta: %d | Tipo Conta: %s \n", c.numero, getTipoConta(c.tipoConta)));
    }

    private String getTipoConta(TipoConta tipoConta) {
        return TipoConta.CONTACORRENTE.equals(tipoConta) ? "Conta Corrente" : "Conta Poupança";
    }
}
