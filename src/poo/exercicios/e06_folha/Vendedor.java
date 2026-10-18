package poo.exercicios.e06_folha;

import poo.m04_polimorfismo.Funcionario;

public class Vendedor extends Funcionario {

    private final double totalVendas;
    private final double percentualComissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + totalVendas * percentualComissao / 100;
    }
}
