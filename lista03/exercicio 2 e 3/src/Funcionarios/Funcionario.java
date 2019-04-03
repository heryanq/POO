package Funcionarios;

public abstract class Funcionario {
    
    public String nome;
    public double salario;

    public Funcionario(String xnome, double xsalario) {
        this.nome = xnome;
        this.salario = xsalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void aumentaSalario(double aumento);
    
}
