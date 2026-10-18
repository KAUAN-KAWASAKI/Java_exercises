package poo.m08_enums_records;

// Record: classe imutável de dados. O compilador gera construtor, getters
// (nome(), sem "get"), equals, hashCode e toString.
public record Ponto(double x, double y) {

    // Construtor compacto: validação
    public Ponto {
        if (Double.isNaN(x) || Double.isNaN(y)) {
            throw new IllegalArgumentException("Coordenadas inválidas");
        }
    }

    // Records podem ter métodos e membros estáticos
    public double distanciaAte(Ponto outro) {
        return Math.hypot(x - outro.x, y - outro.y);
    }

    public static Ponto origem() {
        return new Ponto(0, 0);
    }
}
