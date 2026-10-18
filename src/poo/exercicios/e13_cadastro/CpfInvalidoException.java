package poo.exercicios.e13_cadastro;

// Checked: CPF inválido é falha de dados de entrada, recuperável pelo chamador
public class CpfInvalidoException extends Exception {

    public CpfInvalidoException(String cpf) {
        super("CPF inválido: " + cpf);
    }
}
