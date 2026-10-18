package poo.m03_heranca;

public class Cachorro extends Animal {

    private final String raca;

    public Cachorro(String nome, String raca) {
        super(nome); // o construtor da superclasse roda primeiro
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public void apresentar() {
        super.apresentar(); // reaproveita o comportamento da superclasse
        System.out.println("  Raça: " + raca);
    }
}
