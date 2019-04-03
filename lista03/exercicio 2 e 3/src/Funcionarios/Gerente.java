package Funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    public void aumentaSalario(double aumento) {
        this.salario = this.salario * 1.10;
    }
       
}
