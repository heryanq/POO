package Contas;

public class Main{

    public static void main(String[] args) {
        
        Clientes cli1 = new Clientes("Cleverton","113.184.070-44");
        CCorrente cc1 = new CCorrente(5533103,1000);
        cli1.addContas(cc1);
        
        Clientes cli2 = new Clientes("Ciro","659.816.360-92");
        CCorrente cc2 = new CCorrente(5533104,2000);
        CPoupanca cp1 = new CPoupanca(5533104,2000,100);
        cli2.addContas(cc2);
        cli2.addContas(cp1);
        
        Clientes cli3 = new Clientes("Kelly","332.905.220-16");
        CEspecial ce1 = new CEspecial(5533105,3000,100);
        CInvestimento ci1 = new CInvestimento(5533105,3000,10,12);
        cli3.addContas(ce1);
        cli3.addContas(ci1);
        
        Clientes cli4 = new Clientes("Jaci","083.145.870-44");
        CInvestimento ci2 = new CInvestimento(5533106,4000,11,18);
        cli4.addContas(ci2);
       
        Clientes cli5 = new Clientes("Moacir","204.865.460-63");
   
        System.out.println(cli1.imprimaClientes());
        System.out.println(cli2.imprimaClientes());
        System.out.println(cli3.imprimaClientes());
        System.out.println(cli4.imprimaClientes());
        System.out.println(cli5.imprimaClientes());
        
        System.out.println(cp1.getSaldo());
        cp1.reajustar(0.10);
        
    }
  
    
}