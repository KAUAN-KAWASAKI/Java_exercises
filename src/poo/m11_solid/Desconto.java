package poo.m11_solid;

// OCP + Strategy: para novo tipo de desconto, ADICIONA-se uma classe;
// o código que usa Desconto não muda.
public interface Desconto {
    double aplicar(double valor);
}
