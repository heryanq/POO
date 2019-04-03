package Empresa;

public class Chefe extends Empregado {
    
    public float beneficio;

    public Chefe(float xbeneficio, int xcodigo, String xnome, String xemail, float xsalario) {
        super(xcodigo, xnome, xemail, xsalario);
        this.beneficio = xbeneficio;
    }
    
    @Override
    public float aumentoSalarial(float percentual) {
        return (this.salario * percentual) + this.beneficio;
        
    }
    
}
