package poo.m10_generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caixa<String> texto = new Caixa<>("olá");
        String s = texto.get(); // sem cast
        System.out.println(s);

        // texto.set(123);  // NÃO compila: Caixa<String> só aceita String

        System.out.println(Utilitarios.maior(List.of(3, 9, 4)));
        System.out.println(Utilitarios.maior(List.of("banana", "uva", "maçã")));

        System.out.println(Utilitarios.somar(List.of(1, 2, 3)));
        System.out.println(Utilitarios.somar(List.of(1.5, 2.5)));
    }
}
