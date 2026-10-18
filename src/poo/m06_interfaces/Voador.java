package poo.m06_interfaces;

public interface Voador {

    // Método abstrato implícito (public abstract)
    void voar();

    // Método default: implementação padrão que pode ser sobrescrita
    default void pousar() {
        System.out.println("Pousando...");
    }

    // Método estático da interface
    static String descricao() {
        return "Quem implementa Voador sabe voar.";
    }
}
