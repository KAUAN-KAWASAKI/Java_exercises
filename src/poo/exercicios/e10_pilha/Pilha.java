package poo.exercicios.e10_pilha;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

// Antes: "Pilha extends ArrayList" herdava add(int, E), remove(int)... e quebrava o LIFO.
// Agora: a Pilha TEM UM Deque e expõe só o que uma pilha deve ter.
public class Pilha<T> {

    private final Deque<T> elementos = new ArrayDeque<>();

    public void empilhar(T item) {
        elementos.push(item);
    }

    public T desempilhar() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return elementos.pop();
    }

    public T topo() {
        if (elementos.isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return elementos.peek();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }
}
