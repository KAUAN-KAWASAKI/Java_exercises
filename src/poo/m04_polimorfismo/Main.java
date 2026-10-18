package poo.m04_polimorfismo;

import java.util.List;

public class Main {

    // POLIMORFISMO DE SUBTIPO: o método não sabe qual é a subclasse concreta.
    // A JVM escolhe a implementação em tempo de execução (dispatch dinâmico).
    static double folhaDePagamento(List<Funcionario> equipe) {
        double total = 0;
        for (Funcionario f : equipe) {
            total += f.calcularSalario();
        }
        return total;
    }

    // SOBRECARGA (overload): mesmo nome, parâmetros diferentes — resolvida em compilação.
    static void imprimir(int n)    { System.out.println("int: " + n); }
    static void imprimir(double n) { System.out.println("double: " + n); }
    static void imprimir(String s) { System.out.println("String: " + s); }

    public static void main(String[] args) {
        List<Funcionario> equipe = List.of(
                new Funcionario("Ana", 3000),
                new Gerente("Bruno", 6000, 2000),
                new Estagiario("Caio", 1500)
        );

        System.out.println("Folha total: " + folhaDePagamento(equipe));

        // Pattern matching para acessar o tipo específico
        for (Funcionario f : equipe) {
            if (f instanceof Gerente g) {
                g.aprovarFerias();
            }
        }

        imprimir(1);
        imprimir(1.5);
        imprimir("oi");
    }
}
