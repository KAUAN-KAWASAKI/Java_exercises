package poo.exercicios.e05_veiculos;

public class Caminhao extends Veiculo {

    private static final double VALOR_POR_EIXO = 8.0;

    private final int eixos;

    public Caminhao(String placa, int eixos) {
        super(placa);
        if (eixos < 2) {
            throw new IllegalArgumentException("Caminhão tem ao menos 2 eixos");
        }
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio() {
        return eixos * VALOR_POR_EIXO;
    }
}
