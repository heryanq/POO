package CofrinhoDeMoeda;

public class Main {
    public static void main(String[] args) {
        
        Moeda xmoeda = new Moeda(0.50,"Gilberto");
        Cofrinho cofre = new Cofrinho();
        cofre.adicionar(xmoeda);
        System.out.println(cofre.calcularTotal());
        cofre.contarMoedas();
        cofre.contarMoedasPorValores();
        cofre.menorValor();
    }
    
}
