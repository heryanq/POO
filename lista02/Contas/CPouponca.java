package Contas;

public class CPouponca extends CCorrente { 
    private double saldominimo;

    public CPouponca(int xnumero, float xsaldo, String xcliente, double xsaldominimo) {
        super(xnumero, xsaldo, xcliente);
        this.saldominimo = xsaldominimo;
    }
    
    @Override
    public void debitar(double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            if(this.saldo < this.saldominimo) {
                this.saldominimo = this.saldo;
            } 
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void atualizaSaldo() {
        this.saldo = (double) (this.saldo + (this.saldominimo * 0.02));
        this.saldominimo = this.saldo;
    }

    public double getSaldoMinimo() {
        return saldominimo;
    }
}
