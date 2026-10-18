package poo.m05_abstracao;

public class Triangulo extends Forma {

    private final double a;
    private final double b;
    private final double c;

    public Triangulo(double a, double b, double c) {
        super("Triângulo");
        // desigualdade triangular: cada lado precisa ser menor que a soma dos outros dois
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException("Lados não formam um triângulo");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Fórmula de Herão
        double p = perimetro() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimetro() {
        return a + b + c;
    }
}
