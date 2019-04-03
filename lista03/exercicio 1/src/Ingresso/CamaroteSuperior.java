package Ingresso;

public class CamaroteSuperior extends VIP {
    
    public CamaroteSuperior(int retornaValorIngresso, int adicional, int valor) {
        super(adicional, valor);
    }

    public int retornaValorIngresso() {
        return valorVIP(); 
    }
    
    
    
}
