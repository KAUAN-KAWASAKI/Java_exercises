package poo.exercicios.e07_formas;

import poo.m05_abstracao.Circulo;
import poo.m05_abstracao.Forma;
import poo.m05_abstracao.Retangulo;
import poo.m05_abstracao.Triangulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// O Triangulo foi adicionado no módulo M05 e a Forma agora implementa Comparable.
public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>(List.of(
                new Retangulo(3, 4),     // 12
                new Triangulo(3, 4, 5),  // 6
                new Circulo(2)));        // ~12,57

        Collections.sort(formas); // usa o compareTo da Forma

        formas.forEach(f -> System.out.println(f.descrever()));
    }
}
