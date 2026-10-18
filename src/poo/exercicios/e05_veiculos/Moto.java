package poo.exercicios.e05_veiculos;

public class Moto extends Veiculo {

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularPedagio() {
        return 5.0;
    }
}
