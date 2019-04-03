package Ingresso;

public class Normal extends Ingresso {

    public Normal(String imprimeIngresso, int valor) {
        super(valor);
        this.imprimeIngresso = imprimeIngresso;
    }
    
    public String imprimeIngresso;

    public void imprimeIngresso() {
        System.out.println("Ingresso Normal");
    }
}
