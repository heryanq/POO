package Implemente;

public class Main {

    public static void main(String[] args) {
        
        Administrativo assistenteADM = new Administrativo(10, "5000", "Maurilio", "Rua Joao Costa, 288", "47984747576", "maumau@gmail.com");
        Tecnico assistenteTec = new Tecnico(5, "5001", "Roberta", "Rua dos Engenheiros, 782", "48991565458", "rob.sil@hotmail.com");
        
        System.out.println(assistenteADM.numeroMatricula);
        System.out.println(assistenteADM.nome);
        
        System.out.println(assistenteTec.numeroMatricula);
        System.out.println(assistenteTec.nome); 
    }
    
}
