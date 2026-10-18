package poo.m09_excecoes;

// Exceção CHECKED (estende Exception): o compilador obriga a tratar ou declarar com "throws".
// Para erros de programação (argumento inválido etc.), prefira unchecked (RuntimeException).
public class SaldoInsuficienteException extends Exception {

    private final double faltante;

    public SaldoInsuficienteException(double faltante) {
        super("Saldo insuficiente. Faltam R$ " + faltante);
        this.faltante = faltante;
    }

    public double getFaltante() {
        return faltante;
    }
}
