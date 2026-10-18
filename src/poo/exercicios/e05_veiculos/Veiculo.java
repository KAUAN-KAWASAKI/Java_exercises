package poo.exercicios.e05_veiculos;

public abstract class Veiculo {

    private final String placa;

    protected Veiculo(String placa) {
        this.placa = placa;
    }

    // Cada tipo de veículo define sua regra de pedágio
    public abstract double calcularPedagio();

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + placa + "]";
    }
}
