package Contas;

public class CEspecial extends CCorrente {
    
    private int limite;

    public CEspecial(int xnumero, float xsaldo, int xlimite) {
        super(xnumero, xsaldo);
        this.limite = xlimite;
    }

    
    @Override
    public void debitar(float valor) {
        if(valor <= (getSaldo() + this.limite)) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.print("Saldo Insuficiente");
        }
    }
}
