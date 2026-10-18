package poo.exercicios.e05_veiculos;

public class Carro extends Veiculo {

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public double calcularPedagio() {
        return 10.0;
    }
}
