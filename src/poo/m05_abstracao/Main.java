package poo.m05_abstracao;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Forma f = new Forma("x");  // NÃO compila: classe abstrata não instancia

        List<Forma> formas = List.of(new Circulo(2), new Retangulo(3, 4));
        formas.forEach(f -> System.out.println(f.descrever()));
    }
}
