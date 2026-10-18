package poo.projeto_biblioteca;

import java.time.LocalDate;

public record Emprestimo(Livro livro, Membro membro, LocalDate data) {

    private static final int PRAZO_DIAS = 14;

    public LocalDate dataLimite() {
        return data.plusDays(PRAZO_DIAS);
    }
}
