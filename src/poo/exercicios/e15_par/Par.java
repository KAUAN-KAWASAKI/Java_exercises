package poo.exercicios.e15_par;

public record Par<A, B>(A primeiro, B segundo) {

    public Par<B, A> trocar() {
        return new Par<>(segundo, primeiro);
    }
}
