package poo.exercicios.e03_conta_poupanca;

public class ContaPoupanca {

    private double saldo; // sem setter: só muda via depositar/sacar/render

    public ContaPoupanca(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.saldo = saldoInicial;
    }

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

    /** @param taxa em percentual, ex.: 0.5 para 0,5% */
    public void render(double taxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("Taxa não pode ser negativa");
        }
        saldo += saldo * taxa / 100;
    }

    public double getSaldo() {
        return saldo;
    }
}
