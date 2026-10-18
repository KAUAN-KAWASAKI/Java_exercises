package poo.m08_enums_records;

// Sealed interface: só os tipos listados em "permits" podem implementá-la.
// Com records + switch, o compilador verifica se todos os casos foram tratados.
public sealed interface Pagamento permits Pagamento.Pix, Pagamento.Cartao, Pagamento.Boleto {

    record Pix(String chave) implements Pagamento {}

    record Cartao(String numero, int parcelas) implements Pagamento {}

    record Boleto(String codigoBarras) implements Pagamento {}

    static String descrever(Pagamento p) {
        // Sem "default": o compilador exige exaustividade
        return switch (p) {
            case Pix pix -> "Pix para a chave " + pix.chave();
            case Cartao c -> "Cartão em " + c.parcelas() + "x";
            case Boleto b -> "Boleto " + b.codigoBarras();
        };
    }
}
