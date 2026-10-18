package poo.exercicios.e02_produto;

import java.util.Objects;

public class Produto {

    private static int totalProdutos = 0;

    private final String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        totalProdutos++;
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco;
    }

    // Dois produtos são iguais se tiverem o mesmo nome (o preço não conta)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto outro)) return false;
        return Objects.equals(nome, outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
