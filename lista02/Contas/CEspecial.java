package Contas;

public class CEspecial extends CCorrente {
    private int limite;

    public CEspecial(int xnumero, float xsaldo, String xcliente, int xlimite) {
        super(xnumero, xsaldo, xcliente);
        this.limite = xlimite;
    }

    
    @Override
    public void debitar(double valor) {
        if(valor <= (this.saldo + this.limite)) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.print("Saldo Insuficiente");
        }
    }
}
