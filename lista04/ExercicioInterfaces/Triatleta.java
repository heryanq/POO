package ExercicioInterfaces;

public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {

    public Triatleta(String xnome, String xendereco) {
        super(xnome, xendereco);
    }
    
    @Override
    public void pedalar() {
        System.out.println(this.getNome() + " está pedalando");    
    }
    
    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo");
    }
    
    @Override
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo");
    }
    
    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando");
    }

    

    }

