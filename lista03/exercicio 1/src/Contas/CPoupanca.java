package Contas;

public class CPoupanca extends CCorrente { 
    
    private double saldominimo;

    public CPoupanca(int xnumero, float xsaldo, Clientes xcliente, double xsaldominimo) {
        super(xnumero, xsaldo, xcliente);
        this.saldominimo = xsaldominimo;
    }
    
    @Override
    public void debitar(float valor) {
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
        this.saldo = (float) (this.saldo + (this.saldominimo * 0.02));
        this.saldominimo = this.saldo;
    }

    public double getSaldoMinimo() {
        return saldominimo;
    }
}
