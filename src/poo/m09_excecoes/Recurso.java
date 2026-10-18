package poo.m09_excecoes;

// Implementar AutoCloseable permite usar try-with-resources
public class Recurso implements AutoCloseable {

    private final String nome;

    public Recurso(String nome) {
        this.nome = nome;
        System.out.println("Abrindo " + nome);
    }

    public void usar() {
        System.out.println("Usando " + nome);
    }

    @Override
    public void close() {
        System.out.println("Fechando " + nome);
    }
}
