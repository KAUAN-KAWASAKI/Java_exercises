package poo.m08_enums_records;

public class Main {
    public static void main(String[] args) {
        for (Planeta p : Planeta.values()) {
            System.out.printf("%s: %.2f m/s²%n", p, p.gravidadeSuperficial());
        }

        for (Operacao op : Operacao.values()) {
            System.out.println("6 " + op.getSimbolo() + " 3 = " + op.aplicar(6, 3));
        }
        System.out.println(Operacao.valueOf("SOMA"));

        Ponto a = new Ponto(0, 0);
        Ponto b = new Ponto(3, 4);
        System.out.println(b + " distância=" + a.distanciaAte(b));
        System.out.println("Records iguais por valor? " + a.equals(Ponto.origem()));

        System.out.println(Pagamento.descrever(new Pagamento.Pix("kauan@email.com")));
        System.out.println(Pagamento.descrever(new Pagamento.Cartao("1234", 3)));
    }
}
