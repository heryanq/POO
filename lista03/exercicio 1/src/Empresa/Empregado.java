package Empresa;

public class Empregado {
    
    private int codigo;
    private String nome;
    private float salario;
    private String email;

    public Empregado(int xcodigo, String xnome, String xemail, float xsalario) {
        this.codigo = xcodigo;
        this.nome = xnome;
        this.email = xemail;
        this.salario = xsalario;
    }
    
    public float obterSalario() {
        return salario;
    }
    
    public float aumentoSalarial(float percentual) {
        return this.salario * percentual;
        
    }
    
    
}
