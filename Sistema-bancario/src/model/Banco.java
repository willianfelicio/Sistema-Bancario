package model;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Conta> listaDeContas;

    public Banco(String nome) {
        this.listaDeContas = new ArrayList<>();
    }

    public void criarConta(Conta conta) {
        this.listaDeContas.add(conta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : this.listaDeContas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    public void listarConta(int numero) {
        for (Conta conta : this.listaDeContas) {
           conta.exibirDados();
        }
    }
}