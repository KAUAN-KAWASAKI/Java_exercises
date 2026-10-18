package poo.exercicios.e17_frete;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    // OCP: para um novo tipo de frete, cria-se uma classe e registra-se aqui.
    // Nenhum if/else por tipo no código que calcula.
    static double total(double produto, CalculoFrete frete, double pesoKg, double distanciaKm) {
        return produto + frete.calcular(pesoKg, distanciaKm);
    }

    public static void main(String[] args) {
        Map<String, CalculoFrete> opcoes = new LinkedHashMap<>();
        opcoes.put("Sedex", new Sedex());
        opcoes.put("PAC", new Pac());
        opcoes.put("Retirada", new Retirada());

        opcoes.forEach((nome, frete) ->
                System.out.printf("%-8s -> R$ %.2f%n", nome, total(100, frete, 2.5, 400)));
    }
}
