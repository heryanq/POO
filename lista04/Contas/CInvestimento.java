package Contas;

public class CInvestimento extends CCorrente implements Investimento {
    
    private int diaInvestimento;
    private int periodo;
    
    public CInvestimento(int xnumero, float xsaldo, int xdiaInvestimento, int xperiodo) {
        super(xnumero, xsaldo);
        this.diaInvestimento = xdiaInvestimento;
        this.periodo = xperiodo;
    }
    
    @Override
    public void reajustar(double reajuste) {
        setSaldo(getSaldo() + (getSaldo() * reajuste));
        System.out.println("Saldo após o reajuste: " + getSaldo());
        
    }
    
    
}
