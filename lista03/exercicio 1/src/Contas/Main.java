package Contas;

public class Main{

    public static void main(String[] args) {
        
        Clientes cli1 = new Clientes("Cleverton","113.184.070-44");
        CCorrente cc1 = new CCorrente(5533103,1000,cli1);
        
        Clientes cli2 = new Clientes("Ciro","659.816.360-92");
        CCorrente cc2 = new CCorrente(5533104,2000,cli2);
        CPoupanca cp1 = new CPoupanca(5533104,2000,cli2,100);
        
        Clientes cli3 = new Clientes("Kelly","332.905.220-16");
        CEspecial ce1 = new CEspecial(5533105,3000,cli3,100);
        CInvestimento ci1 = new CInvestimento(5533105,3000,cli3,10,12);
        
        Clientes cli4 = new Clientes("Jaci","083.145.870-44");
        CInvestimento ci2 = new CInvestimento(5533105,3000,cli4,11,18);
        
        Clientes cli5 = new Clientes("Moacir","204.865.460-63");
        
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cp1);
        System.out.println(ce1);
        System.out.println(ci1);
        System.out.println(ci2);
        
        
    }
  
    
}