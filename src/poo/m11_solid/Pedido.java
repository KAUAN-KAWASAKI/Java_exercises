package poo.m11_solid;

// SRP: Pedido só cuida de calcular o total do pedido.
// (Persistir, imprimir e notificar ficam em outras classes.)
public class Pedido {

    private final double subtotal;
    private final Desconto desconto;

    public Pedido(double subtotal, Desconto desconto) {
        this.subtotal = subtotal;
        this.desconto = desconto;
    }

    public double total() {
        return desconto.aplicar(subtotal);
    }
}
