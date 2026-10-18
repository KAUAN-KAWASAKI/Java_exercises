package poo.m11_solid;

public class ServicoDePedidos {

    // Dependência injetada pelo construtor (Injeção de Dependência)
    private final Notificador notificador;

    public ServicoDePedidos(Notificador notificador) {
        this.notificador = notificador;
    }

    public void finalizar(String cliente, Pedido pedido) {
        notificador.enviar(cliente, String.format("Pedido confirmado. Total: R$ %.2f", pedido.total()));
    }
}
