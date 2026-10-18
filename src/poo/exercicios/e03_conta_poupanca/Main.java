package poo.exercicios.e03_conta_poupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca(1000);
        conta.render(0.5);
        System.out.printf("Após rendimento: %.2f%n", conta.getSaldo());

        try {
            conta.sacar(5000);
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
