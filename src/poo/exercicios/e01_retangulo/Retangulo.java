package poo.exercicios.e01_retangulo;

public class Retangulo {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Largura e altura devem ser positivas");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" + largura + " x " + altura + "}";
    }
}
