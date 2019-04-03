package ExercicioInterfaces;

public class Pessoa {
    private String nome, endereco;
    public Pessoa(String xnome, String xendereco) {
        this.nome = xnome;
        this.endereco = xendereco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
}
