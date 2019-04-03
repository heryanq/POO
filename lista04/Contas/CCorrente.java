package Contas;

public class CCorrente {
    
    protected int numero;
    public double saldo;

    public CCorrente(int xnumero, float xsaldo) {
        this.numero = xnumero;
        this.saldo = xsaldo;
    }
    
    public void creditar(float valor) {
        this.saldo = this.saldo + valor;
    }
    
    public void debitar(float valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return ("Conta: " + this.numero + " " + "Saldo: " + this.saldo);
    }
    
}