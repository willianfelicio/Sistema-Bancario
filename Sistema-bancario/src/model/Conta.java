package model;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depositado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito. Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }  else {
            System.out.println("Não foi possível realizar o saque. Valor inválido.");
        }
    }
}
