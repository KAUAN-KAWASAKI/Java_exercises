package poo.m03_heranca;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
                new Animal("Bicho"),
                new Cachorro("Rex", "Labrador"),
                new Gato("Mimi")
        };

        for (Animal a : animais) {
            a.apresentar();
        }

        // Cachorro É UM Animal (relação "é-um")
        Animal a = new Cachorro("Thor", "Poodle");
        System.out.println(a instanceof Cachorro); // true
    }
}
