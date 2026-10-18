package poo.m09_excecoes;

public class Main {
    public static void main(String[] args) {
        Carteira carteira = new Carteira(100);

        try {
            carteira.pagar(40);
            carteira.pagar(100); // lança
            System.out.println("não chega aqui");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage() + " (faltam " + e.getFaltante() + ")");
        } finally {
            // roda sempre, com ou sem exceção
            System.out.println("Saldo final: " + carteira.getSaldo());
        }

        // try-with-resources: close() é chamado automaticamente, mesmo com exceção
        try (Recurso r = new Recurso("arquivo")) {
            r.usar();
            throw new IllegalStateException("falha no meio do uso");
        } catch (IllegalStateException e) {
            System.out.println("Capturada: " + e.getMessage());
        }

        // multi-catch: do mais específico para o mais genérico
        try {
            Object o = "texto";
            Integer n = (Integer) o;
        } catch (ClassCastException | NullPointerException e) {
            System.out.println("Multi-catch: " + e.getClass().getSimpleName());
        }
    }
}
