package poo.m02_encapsulamento;

public class ContaBancaria {

    // Estado privado: ninguém de fora altera o saldo diretamente
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular obrigatório");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Comportamentos protegem a regra de negócio (invariante: saldo >= 0)
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Depósito deve ser positivo");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    // Apenas getters: leitura liberada, escrita controlada pelos métodos acima
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
