package poo.exercicios.e01_retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(3, 4);
        System.out.println(r + " área=" + r.area() + " perímetro=" + r.perimetro());
    }
}
