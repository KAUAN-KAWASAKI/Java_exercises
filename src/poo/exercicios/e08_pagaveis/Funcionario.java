package poo.exercicios.e08_pagaveis;

public class Funcionario implements Pagavel {

    private final String nome;
    private final double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double valorAPagar() {
        return salario;
    }

    @Override
    public String descricao() {
        return "Funcionário " + nome;
    }
}
