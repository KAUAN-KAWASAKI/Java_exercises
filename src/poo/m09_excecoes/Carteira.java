package poo.m09_excecoes;

public class Carteira {

    private double saldo;

    public Carteira(double saldo) {
        this.saldo = saldo;
    }

    public void pagar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(valor - saldo);
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
