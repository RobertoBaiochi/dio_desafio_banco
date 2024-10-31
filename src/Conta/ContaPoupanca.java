package Conta;

import Cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirDados();
    }
}
