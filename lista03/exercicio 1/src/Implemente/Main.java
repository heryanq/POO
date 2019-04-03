package Implemente;

public class Main {

    public static void main(String[] args) {
        
        Administrativo assistenteADM = new Administrativo(10, "5000", "Maurilio", "Rua Joao Costa, 288", "47984747576", "maumau@gmail.com");
        Tecnico assistenteTec = new Tecnico(5, "5001", "Roberta", "Rua dos Engenheiros, 782", "48991565458", "rob.sil@hotmail.com");
        
        System.out.println(assistenteADM.exibeNumeroMatricula());
        System.out.println(assistenteADM.exibeNome());
        
        System.out.println(assistenteTec.exibeNumeroMatricula());
        System.out.println(assistenteTec.exibeNome()); 
    }
    
}
