package Ingresso;

public class VIP extends Ingresso {
    public int adicional;

    public VIP(int adicional, int valor) {
        super(valor);
        this.adicional = adicional;
    }

    public int valorVIPl() {
        return valor + adicional;
    }
}
