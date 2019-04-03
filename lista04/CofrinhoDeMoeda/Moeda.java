package CofrinhoDeMoeda;

public class Moeda {
    protected double valor;
    protected String nome;

    public Moeda(double xvalor, String xnome) {
        this.valor = xvalor;
        this.nome = xnome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
    
}
