package poo.m06_interfaces;

// Uma classe pode implementar VÁRIAS interfaces
public class Pato implements Voador, Nadador, Comparable<Pato> {

    private final String nome;
    private final int peso;

    public Pato(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }

    // Comparable: ordem natural (por peso)
    @Override
    public int compareTo(Pato outro) {
        return Integer.compare(peso, outro.peso);
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return nome + "(" + peso + "g)";
    }
}
