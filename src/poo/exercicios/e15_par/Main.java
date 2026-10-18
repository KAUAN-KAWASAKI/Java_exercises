package poo.exercicios.e15_par;

public class Main {
    public static void main(String[] args) {
        Par<String, Integer> p = new Par<>("idade", 30);
        Par<Integer, String> invertido = p.trocar(); // os tipos também se invertem

        System.out.println(p);
        System.out.println(invertido);
        int numero = invertido.primeiro(); // sem cast
        System.out.println(numero + 1);
    }
}
