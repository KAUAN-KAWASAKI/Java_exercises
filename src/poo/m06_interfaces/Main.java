package poo.m06_interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    // Programe para a INTERFACE, não para a implementação
    static void decolar(Voador v) {
        v.voar();
        v.pousar();
    }

    public static void main(String[] args) {
        Pato donald = new Pato("Donald", 900);
        decolar(donald);
        donald.nadar();
        System.out.println(Voador.descricao());

        List<Pato> patos = new ArrayList<>(List.of(
                donald, new Pato("Patolino", 700), new Pato("Margarida", 800)));

        patos.sort(null); // ordem natural (Comparable)
        System.out.println("Por peso: " + patos);

        patos.sort(Comparator.comparing(Pato::getNome)); // ordem alternativa (Comparator)
        System.out.println("Por nome: " + patos);

        // Voador é interface funcional: só os métodos abstratos contam (default/static não),
        // e ele tem apenas um (voar). Por isso aceita lambda.
        Voador drone = () -> System.out.println("Drone voando (lambda).");
        decolar(drone);
    }
}
