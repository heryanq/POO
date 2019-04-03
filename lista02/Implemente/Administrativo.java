package Implemente;

public class Administrativo extends Assistente{
    
    public int adicionalNoturno;

    public Administrativo(int adicionalNoturno, String numeroMatriculo, String nome, String endereco, String numero, String email) {
        super(numeroMatriculo, nome, endereco, numero, email);
        this.adicionalNoturno = adicionalNoturno;
    }
   
}
