package poo.m07_composicao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // AGREGAÇÃO: Turma TEM alunos, mas os alunos existem independentemente dela.
    static class Aluno {
        final String nome;
        Aluno(String nome) { this.nome = nome; }
    }

    static class Turma {
        private final List<Aluno> alunos = new ArrayList<>();
        void matricular(Aluno a) { alunos.add(a); }
        int tamanho() { return alunos.size(); }
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca");
        carro.partida();
        System.out.println("Em movimento? " + carro.emMovimento());
        carro.parar();

        Aluno ana = new Aluno("Ana");
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        t1.matricular(ana);
        t2.matricular(ana); // o mesmo aluno em duas turmas: agregação
        System.out.println("Turma 1: " + t1.tamanho() + " | Turma 2: " + t2.tamanho());
    }
}
