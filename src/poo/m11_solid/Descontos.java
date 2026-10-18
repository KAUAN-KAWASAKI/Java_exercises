package poo.m11_solid;

public final class Descontos {

    private Descontos() {}

    public static Desconto nenhum() {
        return valor -> valor;
    }

    public static Desconto percentual(double percentual) {
        return valor -> valor * (1 - percentual / 100);
    }

    public static Desconto fixo(double quantia) {
        return valor -> Math.max(0, valor - quantia);
    }
}
