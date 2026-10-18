package poo.m03_heranca;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }
}
