package Pessoas;

public class Main{

    public static void main(String[] args) {
        
        Rica rich = new Rica(50000,"Margarete",60);
        rich.fazCompras();
        Pobre poor = new Pobre("Jérson",35);
        poor.trabalha();
        Miseravel miserable = new Miseravel("Clóvis",47);
        miserable.mendigar();
    }
    
}