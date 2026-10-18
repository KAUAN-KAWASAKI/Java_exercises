package poo.exercicios.e17_frete;

public class Pac implements CalculoFrete {

    @Override
    public double calcular(double pesoKg, double distanciaKm) {
        return 8 + pesoKg * 1.0 + distanciaKm * 0.02;
    }
}
