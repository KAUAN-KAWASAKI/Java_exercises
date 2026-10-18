package poo.m05_abstracao;

public abstract class Forma implements Comparable<Forma> {

    private final String nome;

    protected Forma(String nome) {
        this.nome = nome;
    }

    // Método abstrato: sem corpo, cada subclasse é obrigada a implementar
    public abstract double area();

    public abstract double perimetro();

    // Ordem natural: da menor para a maior área
    @Override
    public int compareTo(Forma outra) {
        return Double.compare(area(), outra.area());
    }

    // Método concreto que usa os abstratos (Template Method)
    public String descrever() {
        return String.format("%s -> área=%.2f, perímetro=%.2f", nome, area(), perimetro());
    }
}
