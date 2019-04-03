package Ingresso;

public class VIP extends Ingresso {
    
    private int adicional;

    public VIP(int adicional, int valor) {
        super(valor);
        this.adicional = adicional;
    }

    public int valorVIP() {
        return imprimeValor() + adicional;
    }
}
