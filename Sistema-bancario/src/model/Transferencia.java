package model;

public class Transferencia {

    private double valor;
    private String data;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transferencia(double valor, String data, Conta contaOrigem, Conta contaDestino) {
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void exibirDetalhes() {
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);

        if (contaOrigem != null) {
            System.out.println("Conta origem: " + contaOrigem);
        }

        if (contaDestino != null) {
            System.out.println("Conta destino: " + contaDestino);
        }
    }

    public void registrar() {

        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }

        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Contas inválidas para transferência.");
        }
    }
}


