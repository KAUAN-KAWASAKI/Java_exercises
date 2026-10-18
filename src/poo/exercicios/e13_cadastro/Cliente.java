package poo.exercicios.e13_cadastro;

public class Cliente {

    private final String nome;
    private final String cpf; // somente dígitos

    // Construtor privado: só se cria Cliente válido, via fábrica estática
    private Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public static Cliente criar(String nome, String cpf) throws CpfInvalidoException {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        String digitos = cpf == null ? "" : cpf.replaceAll("\\D", "");
        if (!cpfValido(digitos)) {
            throw new CpfInvalidoException(cpf);
        }
        return new Cliente(nome, digitos);
    }

    private static boolean cpfValido(String c) {
        if (c.length() != 11 || c.chars().distinct().count() == 1) {
            return false; // tamanho errado ou todos os dígitos iguais
        }
        return digitoVerificador(c, 9) == c.charAt(9) - '0'
                && digitoVerificador(c, 10) == c.charAt(10) - '0';
    }

    // Calcula o dígito verificador usando os primeiros 'qtd' dígitos
    private static int digitoVerificador(String c, int qtd) {
        int soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += (c.charAt(i) - '0') * (qtd + 1 - i);
        }
        int resto = (soma * 10) % 11;
        return resto == 10 ? 0 : resto;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
