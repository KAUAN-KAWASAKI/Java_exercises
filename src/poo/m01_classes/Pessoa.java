package poo.m01_classes;

import java.util.Objects;

public class Pessoa {

    // Atributo estático: pertence à classe, compartilhado por todos os objetos
    private static int totalCriadas = 0;

    // Atributos de instância: cada objeto tem os seus
    private final String nome;
    private int idade;

    // Construtor completo
    public Pessoa(String nome, int idade) {
        this.nome = nome;   // 'this' diferencia o atributo do parâmetro
        this.idade = idade;
        totalCriadas++;
    }

    // Sobrecarga de construtor: encadeia para o construtor completo
    public Pessoa(String nome) {
        this(nome, 0);
    }

    public void fazerAniversario() {
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getTotalCriadas() {
        return totalCriadas;
    }

    // equals/hashCode definem a igualdade por VALOR (o padrão é por referência)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa outra)) return false;
        return idade == outra.idade && Objects.equals(nome, outra.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}
