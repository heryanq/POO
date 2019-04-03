package Implemente;

public class Tecnico extends Assistente{
    
    private int bonusSalarial;

    public Tecnico(int bonusSalarial, String numeroMatriculo, String nome, String endereco, String numero, String email) {
        super(numeroMatriculo, nome, endereco, numero, email);
        this.bonusSalarial = bonusSalarial;
    }
    
    public int exibeBonusSalarial() {
        return bonusSalarial;
    }
    
}
    

