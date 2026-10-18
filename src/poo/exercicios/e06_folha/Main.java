package poo.exercicios.e06_folha;

import poo.m04_polimorfismo.Estagiario;
import poo.m04_polimorfismo.Funcionario;
import poo.m04_polimorfismo.Gerente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = List.of(
                new Funcionario("Ana", 3000),
                new Gerente("Bruno", 6000, 2000),
                new Estagiario("Caio", 1500),
                new Vendedor("Diana", 2500, 20000, 5)); // 2500 + 5% de 20000 = 3500

        double total = 0;
        for (Funcionario f : equipe) {
            System.out.printf("%-6s R$ %.2f%n", f.getNome(), f.calcularSalario());
            total += f.calcularSalario();
        }
        System.out.printf("Total da folha: R$ %.2f%n", total);
    }
}
