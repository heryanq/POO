package Pessoas;

public class Rica extends Pessoa {
    
    public double dinheiro;

    public Rica(double dinheiro, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        System.out.println("Hm, eu acho que vou comprar isto");
    }
    
}
