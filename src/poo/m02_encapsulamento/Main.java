package poo.m02_encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Kauan", 100);
        conta.depositar(50);
        conta.sacar(30);
        System.out.println(conta.getTitular() + " -> R$ " + conta.getSaldo());

        // conta.saldo = 1_000_000;  // NÃO compila: o campo é private

        try {
            conta.sacar(1_000);
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
