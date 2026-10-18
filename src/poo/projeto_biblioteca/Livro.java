package poo.projeto_biblioteca;

import java.util.Objects;

public class Livro {

    private final String isbn;
    private final String titulo;
    private final String autor;
    private boolean emprestado;

    public Livro(String isbn, String titulo, String autor) {
        this.isbn = Objects.requireNonNull(isbn);
        this.titulo = Objects.requireNonNull(titulo);
        this.autor = Objects.requireNonNull(autor);
    }

    // Package-private: só a Biblioteca controla o estado de empréstimo
    void marcarEmprestado() {
        emprestado = true;
    }

    void marcarDevolvido() {
        emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Livro outro && isbn.equals(outro.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ")" + (emprestado ? " [emprestado]" : "");
    }
}
