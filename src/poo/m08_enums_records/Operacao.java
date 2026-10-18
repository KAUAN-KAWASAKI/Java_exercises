package poo.m08_enums_records;

// Enum com comportamento por constante (cada constante implementa o método abstrato)
public enum Operacao {
    SOMA("+") {
        @Override
        public double aplicar(double a, double b) { return a + b; }
    },
    MULTIPLICACAO("*") {
        @Override
        public double aplicar(double a, double b) { return a * b; }
    };

    private final String simbolo;

    Operacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public abstract double aplicar(double a, double b);

    public String getSimbolo() {
        return simbolo;
    }
}
