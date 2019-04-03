package Contas;

public class CCorrente {
    private int numero;
    public float saldo;
    private Clientes cliente;

    public CCorrente(int xnumero, float xsaldo, Clientes xclientes) {
        this.numero = xnumero;
        this.saldo = xsaldo;
        this.cliente = xclientes;
    }
    
    public void creditar(int valor) {
        this.saldo = saldo + valor;
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
    
    @Override
    public String toString() {
        return "Essa conta pertence ao cliente: " + this.cliente.getNomeCliente();
    }
    
}  