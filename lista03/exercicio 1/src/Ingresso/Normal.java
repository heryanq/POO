package Ingresso;

public class Normal extends Ingresso {
    
    private String imprimeIngresso;

    public Normal(String imprimeIngresso, int valor) {
        super(valor);
        this.imprimeIngresso = imprimeIngresso;
    }
    
    public void imprimeIngresso() {
        System.out.println("Ingresso Normal");
    }
}
