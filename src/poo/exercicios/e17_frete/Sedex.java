package poo.exercicios.e17_frete;

public class Sedex implements CalculoFrete {

    @Override
    public double calcular(double pesoKg, double distanciaKm) {
        return 15 + pesoKg * 2.0 + distanciaKm * 0.05;
    }
}
