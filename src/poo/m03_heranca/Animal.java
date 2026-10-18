package poo.m03_heranca;

public class Animal {

    protected final String nome; // protected: visível nas subclasses

    public Animal(String nome) {
        this.nome = nome;
    }

    public String emitirSom() {
        return "(som genérico)";
    }

    public void apresentar() {
        System.out.println(nome + " faz: " + emitirSom());
    }
}
