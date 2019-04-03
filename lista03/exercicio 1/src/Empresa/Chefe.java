package Empresa;

public class Chefe extends Empregado {
    
    private float beneficio;

    public Chefe(float xbeneficio, int xcodigo, String xnome, String xemail, float xsalario) {
        super(xcodigo, xnome, xemail, xsalario);
        this.beneficio = xbeneficio;
    }
    
    @Override
    public float aumentoSalarial(float percentual) {
        return (obterSalario() * percentual) + this.beneficio;
        
    }
    
}
