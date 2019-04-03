package Animais;

public class Cachorro extends Animal {

    public Cachorro(String xnome, String xraca) {
        super(xnome, xraca);
    }
    
    public void late() {
        System.out.println("Cachorro: AuAu");
    }
    
}
