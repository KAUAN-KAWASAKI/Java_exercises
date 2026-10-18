package poo.m07_composicao;

// Carro TEM UM Motor (relação "tem-um"), não "é um" Motor.
public class Carro {

    private final String modelo;
    private final Motor motor; // composição: o Motor nasce e morre com o Carro

    public Carro(String modelo) {
        this.modelo = modelo;
        this.motor = new Motor();
    }

    // Delegação: Carro expõe seu próprio comportamento e delega ao Motor
    public void partida() {
        System.out.println(modelo + ": dando partida...");
        motor.ligar();
    }

    public void parar() {
        motor.desligar();
    }

    public boolean emMovimento() {
        return motor.isLigado();
    }
}
