package Contas;

public class CPoupanca extends CCorrente implements Investimento { 
    
    private double saldominimo;

    public CPoupanca(int xnumero, float xsaldo, double xsaldominimo) {
        super(xnumero, xsaldo);
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
    
    @Override
    public void reajustar(double reajuste) {
        setSaldo(getSaldo() + (getSaldo() * reajuste));
        System.out.println("Saldo após o reajuste: " + getSaldo());
    }
}
