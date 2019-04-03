package Implemente;

public class Funcionario {
    
   private String nome;
   private String endereco;
   private String numero;
   private String email;

    public Funcionario(String nome, String endereco, String numero, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.email = email;
    }

    public String exibeNome() {
        return nome;
    }

    public String exibeEndereco() {
        return endereco;
    }

    public String exibeNumero() {
        return numero;
    }

    public String Email() {
        return email;
    }
    
}
