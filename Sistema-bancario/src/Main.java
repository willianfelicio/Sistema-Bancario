import model.Banco;
import model.Conta;
import model.Transferencia;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Banco Cavalcanti");

        Conta conta1 = new Conta(1001, "Willian", 1000);
        Conta conta2 = new Conta(1002, "Mikaelly", 500);

        banco.criarConta(conta1);
        banco.criarConta(conta2);

        banco.listarContas();

        Transferencia transferencia = new Transferencia(
                200,
                "13/07/2026",
                conta1,
                conta2
        );

        transferencia.registrar();

        banco.listarContas();
    }
}