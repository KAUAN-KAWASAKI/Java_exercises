package poo.projeto_biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Biblioteca {

    private final Map<String, Livro> acervo = new HashMap<>();   // isbn -> livro
    private final List<Emprestimo> emprestimosAtivos = new ArrayList<>();

    public void adicionar(Livro livro) {
        acervo.put(livro.getIsbn(), livro);
    }

    public Optional<Livro> buscarPorIsbn(String isbn) {
        return Optional.ofNullable(acervo.get(isbn));
    }

    public List<Livro> buscarPorAutor(String autor) {
        return acervo.values().stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
                .toList();
    }

    public Emprestimo emprestar(String isbn, Membro membro) throws LivroIndisponivelException {
        Livro livro = buscarPorIsbn(isbn)
                .orElseThrow(() -> new LivroIndisponivelException("Livro não encontrado: " + isbn));
        if (livro.isEmprestado()) {
            throw new LivroIndisponivelException("Já emprestado: " + livro.getTitulo());
        }
        livro.marcarEmprestado();
        Emprestimo e = new Emprestimo(livro, membro, LocalDate.now());
        emprestimosAtivos.add(e);
        return e;
    }

    public void devolver(String isbn) {
        emprestimosAtivos.removeIf(e -> e.livro().getIsbn().equals(isbn));
        buscarPorIsbn(isbn).ifPresent(Livro::marcarDevolvido);
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        return List.copyOf(emprestimosAtivos); // cópia imutável: protege o estado interno
    }
}
