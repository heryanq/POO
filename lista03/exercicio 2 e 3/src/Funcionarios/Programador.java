package Funcionarios;

public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    
    public void aumentaSalario(double aumento) {
        this.salario = this.salario * 1.20;
    }
       
}