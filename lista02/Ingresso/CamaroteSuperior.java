package Ingresso;

public class CamaroteSuperior extends VIP {
    
    public int retornaValorIngresso;

    public CamaroteSuperior(int retornaValorIngresso, int adicional, int valor) {
        super(adicional, valor);
        this.retornaValorIngresso = retornaValorIngresso;
    }

    public int retornaValorIngresso() {
        return valor + adicional;
    }
    
    
    
}
