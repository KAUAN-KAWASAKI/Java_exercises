package poo.exercicios.e12_forma_sealed;

public sealed interface Forma permits Forma.Circulo, Forma.Quadrado {

    record Circulo(double raio) implements Forma {}

    record Quadrado(double lado) implements Forma {}

    // Sem "default": se surgir uma nova Forma, este switch deixa de compilar
    static double area(Forma forma) {
        return switch (forma) {
            case Circulo c -> Math.PI * c.raio() * c.raio();
            case Quadrado q -> q.lado() * q.lado();
        };
    }
}
