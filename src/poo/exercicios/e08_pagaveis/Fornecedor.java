package poo.exercicios.e08_pagaveis;

public class Fornecedor implements Pagavel {

    private final String empresa;
    private final double valorNota;

    public Fornecedor(String empresa, double valorNota) {
        this.empresa = empresa;
        this.valorNota = valorNota;
    }

    @Override
    public double valorAPagar() {
        return valorNota;
    }

    @Override
    public String descricao() {
        return "Fornecedor " + empresa;
    }
}
