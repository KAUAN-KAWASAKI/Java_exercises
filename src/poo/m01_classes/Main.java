package poo.m01_classes;

public class Main {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", 25);
        Pessoa bebe = new Pessoa("Bebê");
        ana.fazerAniversario();

        System.out.println(ana);
        System.out.println(bebe);
        System.out.println("Total criadas: " + Pessoa.getTotalCriadas());

        // == compara referências; equals compara valores
        Pessoa copia = new Pessoa("Ana", 26);
        System.out.println("ana == copia      -> " + (ana == copia));
        System.out.println("ana.equals(copia) -> " + ana.equals(copia));
    }
}
