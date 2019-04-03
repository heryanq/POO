package Empresa;

public class Empregado {
    
    public int codigo;
    public String nome;
    public String email;
    public float salario;

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
