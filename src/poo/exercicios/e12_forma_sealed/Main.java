package poo.exercicios.e12_forma_sealed;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = List.of(new Forma.Circulo(1), new Forma.Quadrado(3));
        for (Forma f : formas) {
            System.out.printf("%s -> área %.2f%n", f, Forma.area(f));
        }
    }
}
