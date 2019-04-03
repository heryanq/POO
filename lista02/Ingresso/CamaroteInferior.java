package Ingresso;

public class CamaroteInferior extends VIP {
    
    public String localizacao;

    public CamaroteInferior(String localizacao, int adicional, int valor) {
        super(adicional, valor);
        this.localizacao = localizacao;
    }

    public String imprimirLocalizacao() {
        return localizacao;
    }

    public void acessarLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    
}
