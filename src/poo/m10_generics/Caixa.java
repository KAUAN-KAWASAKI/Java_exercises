package poo.m10_generics;

// Classe genérica: T é definido por quem usa. Segurança de tipos sem casts.
public class Caixa<T> {

    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public T get() {
        return conteudo;
    }

    public void set(T conteudo) {
        this.conteudo = conteudo;
    }
}
