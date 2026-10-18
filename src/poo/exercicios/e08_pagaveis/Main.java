package poo.exercicios.e08_pagaveis;

import java.util.List;

public class Main {

    // Recebe qualquer coisa Pagavel: não importa se é funcionário ou fornecedor
    static double pagarTodos(List<Pagavel> pagaveis) {
        double total = 0;
        for (Pagavel p : pagaveis) {
            System.out.printf("Pagando %s: R$ %.2f%n", p.descricao(), p.valorAPagar());
            total += p.valorAPagar();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Pagavel> lista = List.of(
                new Funcionario("Ana", 3000),
                new Funcionario("Bruno", 4500),
                new Fornecedor("Papelaria Ltda", 1200));

        System.out.printf("Total pago: R$ %.2f%n", pagarTodos(lista));
    }
}
