import Cliente.Cliente;
import Conta.*;

public class Banco {
    public static final String NOME_BANCO = "Banco Bank";

    public static void main(String[] args) {
        Cliente afonso = new Cliente("Afonso", "Tavares");
        ContaCorrente cc = new ContaCorrente(afonso);
        Cliente fatima = new Cliente("Fatima", "Bernarde");
        ContaPoupanca poupanca = new ContaPoupanca(fatima);

        afonso.imprimirDadosCliente();
        cc.depositar(600.0);
        cc.transferir(50.0, poupanca);
        cc.imprimirExtrato();


        fatima.imprimirDadosCliente();
        poupanca.imprimirExtrato();
    }

    public String getNomeBanco() {
        return NOME_BANCO;
    }
}