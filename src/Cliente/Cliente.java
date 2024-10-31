package Cliente;
import Conta.*;

public class Cliente {

    private String nome;
    private String sobrenome;
    private Conta conta;
    private Integer numeroConta;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getNumeroConta() {
        return (conta != null) ? conta.getNumeroConta() : null;
    }

    public void imprimirDadosCliente() {

        System.out.println("=== Dados Do Cliente ===");

        System.out.println("Nome Completo do Cliente: " + nome + " " + sobrenome);

        if (numeroConta == null || numeroConta < 0) {
            System.out.println("O cliente ainda não possui conta.");
        } else {
            System.out.println("Número da sua conta: " + numeroConta);
        }
    }

    public void setNumeroConta(Integer numero) {
        this.numeroConta = numero;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
