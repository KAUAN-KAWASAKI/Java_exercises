package poo.m10_generics;

import java.util.List;

public final class Utilitarios {

    private Utilitarios() {} // classe utilitária: não instancia

    // Método genérico com limite superior: T precisa ser comparável a si mesmo
    public static <T extends Comparable<T>> T maior(List<T> itens) {
        T max = itens.get(0);
        for (T item : itens) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    // Wildcard "? extends Number": aceita List<Integer>, List<Double>... (só leitura)
    public static double somar(List<? extends Number> numeros) {
        double soma = 0;
        for (Number n : numeros) {
            soma += n.doubleValue();
        }
        return soma;
    }
}
