package poo.m11_solid;

// DIP: o código de alto nível depende desta abstração, não de e-mail/SMS concretos.
public interface Notificador {
    void enviar(String destinatario, String mensagem);
}
