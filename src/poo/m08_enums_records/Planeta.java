package poo.m08_enums_records;

// Enum com campos, construtor e método: um conjunto FECHADO de instâncias
public enum Planeta {
    MERCURIO(3.303e+23, 2.4397e6),
    TERRA(5.976e+24, 6.37814e6),
    JUPITER(1.9e+27, 7.1492e7);

    private static final double G = 6.67300E-11;

    private final double massa;  // kg
    private final double raio;   // m

    Planeta(double massa, double raio) {
        this.massa = massa;
        this.raio = raio;
    }

    public double gravidadeSuperficial() {
        return G * massa / (raio * raio);
    }
}
