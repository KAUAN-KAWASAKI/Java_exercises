package poo.exercicios.e04_senha;

public class Main {
    public static void main(String[] args) {
        Senha senha = new Senha("minhasenha1");
        System.out.println("Imprimindo: " + senha);
        System.out.println("Senha certa? " + senha.confere("minhasenha1"));
        System.out.println("Senha errada? " + senha.confere("outra1234"));

        for (String ruim : new String[]{"curta1", "semnumeroaqui"}) {
            try {
                new Senha(ruim);
            } catch (IllegalArgumentException e) {
                System.out.println("Rejeitada (" + ruim + "): " + e.getMessage());
            }
        }
    }
}
