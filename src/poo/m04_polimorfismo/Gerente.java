package poo.m04_polimorfismo;

public class Gerente extends Funcionario {

    private final double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    public void aprovarFerias() {
        System.out.println(nome + " aprovou as férias da equipe.");
    }
}
