package poo.projeto_biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionar(new Livro("111", "Clean Code", "Robert Martin"));
        biblioteca.adicionar(new Livro("222", "Effective Java", "Joshua Bloch"));

        Membro ana = new Membro(1, "Ana");
        Membro bruno = new Membro(2, "Bruno");

        try {
            Emprestimo e = biblioteca.emprestar("111", ana);
            System.out.println(e.membro().nome() + " pegou \"" + e.livro().getTitulo()
                    + "\" até " + e.dataLimite());

            biblioteca.emprestar("111", bruno); // já emprestado -> exceção
        } catch (LivroIndisponivelException ex) {
            System.out.println("Não foi possível emprestar: " + ex.getMessage());
        }

        biblioteca.devolver("111");
        biblioteca.buscarPorAutor("joshua bloch").forEach(System.out::println);
        System.out.println("Empréstimos ativos: " + biblioteca.getEmprestimosAtivos().size());
    }
}
