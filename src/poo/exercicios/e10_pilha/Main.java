package poo.exercicios.e10_pilha;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();
        pilha.empilhar("a");
        pilha.empilhar("b");
        pilha.empilhar("c");

        System.out.println("Topo: " + pilha.topo());
        while (!pilha.estaVazia()) {
            System.out.print(pilha.desempilhar() + " "); // c b a
        }
        System.out.println();

        try {
            pilha.desempilhar();
        } catch (NoSuchElementException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
