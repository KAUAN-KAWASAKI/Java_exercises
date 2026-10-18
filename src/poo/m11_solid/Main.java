package poo.m11_solid;

public class Main {
    public static void main(String[] args) {
        Pedido semDesconto = new Pedido(200, Descontos.nenhum());
        Pedido comPercentual = new Pedido(200, Descontos.percentual(10));
        Pedido comFixo = new Pedido(200, Descontos.fixo(50));

        // Implementações de Notificador trocáveis sem mexer no ServicoDePedidos
        Notificador email = (dest, msg) -> System.out.println("[EMAIL -> " + dest + "] " + msg);
        Notificador sms = (dest, msg) -> System.out.println("[SMS   -> " + dest + "] " + msg);

        new ServicoDePedidos(email).finalizar("ana@email.com", semDesconto);
        new ServicoDePedidos(email).finalizar("ana@email.com", comPercentual);
        new ServicoDePedidos(sms).finalizar("+55 11 99999-0000", comFixo);
    }
}
