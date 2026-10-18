package poo.projeto_biblioteca;

public record Membro(int id, String nome) {

    public Membro {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
    }
}
