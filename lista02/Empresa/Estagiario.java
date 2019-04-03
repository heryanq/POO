package Empresa;

public class Estagiario extends Empregado {
    
    public int descontos;

    public Estagiario(int xdescontos, int xcodigo, String xnome, String xemail, float xsalario) {
        super(xcodigo, xnome, xemail, xsalario);
        this.descontos = xdescontos;
    }
    
    @Override
    public float aumentoSalarial(float percentual) {
        return (this.salario * percentual) - this.descontos;
        
    }
    
    
}
