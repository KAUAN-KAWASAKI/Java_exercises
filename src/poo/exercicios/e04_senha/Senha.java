package poo.exercicios.e04_senha;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

// Classe imutável: não guarda o texto da senha, só o hash.
public final class Senha {

    private final String hash;

    public Senha(String texto) {
        validar(texto);
        this.hash = gerarHash(texto);
    }

    private static void validar(String texto) {
        if (texto == null || texto.length() < 8) {
            throw new IllegalArgumentException("A senha precisa ter pelo menos 8 caracteres");
        }
        if (texto.chars().noneMatch(Character::isDigit)) {
            throw new IllegalArgumentException("A senha precisa ter pelo menos 1 número");
        }
    }

    private static String gerarHash(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(texto.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 indisponível", e);
        }
    }

    public boolean confere(String tentativa) {
        return tentativa != null && hash.equals(gerarHash(tentativa));
    }

    // Nunca mostra a senha (nem o hash)
    @Override
    public String toString() {
        return "********";
    }
}
