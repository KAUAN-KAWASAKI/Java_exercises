package poo.m04_polimorfismo;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double bolsa) {
        super(nome, bolsa);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.9; // exemplo: desconto fictício
    }
}
