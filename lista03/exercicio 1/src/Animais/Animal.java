package Animais;

public class Animal {
    
    private String nome;
    private String raca;

    public Animal(String xnome, String xraca) {
        this.nome = xnome;
        this.raca = xraca;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void caminha() {
        System.out.println("Estou a caminhar");
    }
   
    
}
