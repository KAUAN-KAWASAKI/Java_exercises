package poo.exercicios.e13_cadastro;

public class Main {
    public static void main(String[] args) {
        for (String cpf : new String[]{"529.982.247-25", "111.111.111-11", "123.456.789-00"}) {
            try {
                Cliente c = Cliente.criar("Ana", cpf);
                System.out.println("OK: " + c.getNome() + " " + c.getCpf());
            } catch (CpfInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
