package poo.exercicios.e05_veiculos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> fila = List.of(
                new Carro("ABC-1234"),
                new Moto("XYZ-9876"),
                new Caminhao("CAM-0001", 4));

        double total = 0;
        for (Veiculo v : fila) {
            System.out.printf("%s paga R$ %.2f%n", v, v.calcularPedagio());
            total += v.calcularPedagio();
        }
        System.out.printf("Arrecadado: R$ %.2f%n", total);
    }
}
