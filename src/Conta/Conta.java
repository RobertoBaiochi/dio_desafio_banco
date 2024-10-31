package Conta;

import Cliente.Cliente;

import java.util.Objects;

public class Conta implements IConta {

    private static final int AGENCIA_FIXA = 1;
    private static Integer CONTA_SEQUENCIA = 1;

    private int agencia;
    private Integer numeroConta;
    protected Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_FIXA;
        this.numeroConta = CONTA_SEQUENCIA++;
        cliente.setNumeroConta(this.numeroConta);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Número da agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.printf("Saldo: %.2f \n", saldo);
        System.out.println("Titular da Conta: " + this.cliente.getNome() + " " + this.cliente.getSobrenome());
        cliente.setConta(this);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Integer getNumeroConta() {
        return Objects.requireNonNullElseGet(this.numeroConta, () -> this.numeroConta = -1);
    }
}
