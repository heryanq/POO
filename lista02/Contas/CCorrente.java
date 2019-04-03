package Contas;

public class CCorrente {
    private int numero;
    double saldo;
    private String cliente;

    public CCorrente(int xnumero, float xsaldo, String xcliente) {
        this.numero = xnumero;
        this.saldo = xsaldo;
        this.cliente = xcliente;
    }
    
    public void creditar(int valor) {
        this.saldo = saldo + valor;
    }
    
    public void debitar(double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

}  