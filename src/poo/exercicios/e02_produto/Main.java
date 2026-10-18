package poo.exercicios.e02_produto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Produto a = new Produto("Caneta", 3.5);
        Produto b = new Produto("Caneta", 4.0); // mesmo nome, preço diferente
        Produto c = new Produto("Caderno", 20);

        System.out.println("a.equals(b)? " + a.equals(b));
        System.out.println("a.equals(c)? " + a.equals(c));
        System.out.println("Total criados: " + Produto.getTotalProdutos());

        // O HashSet usa equals/hashCode, então "Caneta" entra só uma vez
        Set<Produto> catalogo = new HashSet<>(Set.of(a, c));
        catalogo.add(b);
        System.out.println("Tamanho do catálogo: " + catalogo.size());
    }
}
