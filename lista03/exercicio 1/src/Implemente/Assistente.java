package Implemente;

public class Assistente extends Funcionario {
    
    private String numeroMatricula;

    public Assistente(String numeroMatricula, String nome, String endereco, String numero, String email) {
        super(nome, endereco, numero, email);
        this.numeroMatricula = numeroMatricula;
    }

    public String exibeNumeroMatricula() {
        return numeroMatricula;
    }
     
}
