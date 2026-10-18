package poo.m07_composicao;

public class Motor {

    private boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Motor ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Motor desligado.");
    }

    public boolean isLigado() {
        return ligado;
    }
}
