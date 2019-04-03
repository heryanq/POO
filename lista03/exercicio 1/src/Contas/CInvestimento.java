package Contas;

public class CInvestimento extends CCorrente {
    
    private int diaInvestimento;
    private int periodo;
    
    public CInvestimento(int xnumero, float xsaldo, Clientes xcliente, int xdiaInvestimento, int xperiodo) {
        super(xnumero, xsaldo, xcliente);
        this.diaInvestimento = xdiaInvestimento;
        this.periodo = xperiodo;
    }
    
    
}
