package CofrinhoDeMoeda;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    
    protected List <Moeda> listaMoedas;
    
    public Cofrinho() {  
        this.listaMoedas = new ArrayList();
    
    }
    public void adicionar(Moeda xmoeda) {
        listaMoedas.add(xmoeda);     
    }
    
    public String calcularTotal() {
        double total = 0;
        for (Moeda xmoeda:listaMoedas) {
            total += xmoeda.getValor();
        }
        System.out.println("O valor total armazenado no cofrinho é: " + total + " reais");
        return "";
    }
    
    public void contarMoedas () {
       System.out.println("A quantidade de moedas no cofrinho é: " + listaMoedas.size());
    }
    
    public void contarMoedasPorValores() {
        int moeda1 = 0;
        int moeda5 = 0;
        int moeda10 = 0;
        int moeda25 = 0;
        int moeda50 = 0;
        int moeda1real = 0;
        for (Moeda xmoeda:listaMoedas) {
            if (xmoeda.getValor() == 0.01) {
                moeda1 += 1;
            } else if (xmoeda.getValor() == 0.05) {
                moeda5 += 1;
            } else if (xmoeda.getValor() == 0.10) {
                moeda10 += 1;
            } else if (xmoeda.getValor() == 0.25) {
                moeda25 += 1;
            } else if (xmoeda.getValor() == 0.50) {
                moeda50 += 1;
            } else {
                moeda1real += 1; 
            }
            System.out.println("A quantidade de moedas de 1 centavos é de: " + moeda1);
            System.out.println("A quantidade de moedas de 5 centavos é de: " + moeda5);
            System.out.println("A quantidade de moedas de 10 centavos é de: " + moeda10);
            System.out.println("A quantidade de moedas de 25 centavos é de: " + moeda25);
            System.out.println("A quantidade de moedas de 50 centavos é de: " + moeda50);
            System.out.println("A quantidade de moedas de 1 Real é de: " + moeda1real);
        }
    }
        
        public void menorValor() {
            double menor = 0;
            for (Moeda xmoeda:listaMoedas) {
            if (xmoeda.getValor() == 0.01) {
                menor = xmoeda.getValor();
            } else if (xmoeda.getValor() == 0.05) {
                menor = xmoeda.getValor();
            } else if (xmoeda.getValor() == 0.10) {
                menor = xmoeda.getValor();
            } else if (xmoeda.getValor() == 0.25) {
                menor = xmoeda.getValor();
            } else if (xmoeda.getValor() == 0.50) {
                menor = xmoeda.getValor();
            } else {
                menor = xmoeda.getValor();
            }
            System.out.println("O valor da menor moeda presente no cofrinho é: " + menor);
                    
        }
    }

}
        

    
    

