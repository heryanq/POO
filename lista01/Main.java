package lista01;

public class Main {
    
    public static void main(String[] args) {
        Bola redonda = new Bola("preto",10,"vidro");
        redonda.setCor("roxo");

        Quadrado quadratico = new Quadrado(10);
        quadratico.setLado(11);

        Pessoa humano = new Pessoa("Bárbara",19,60,1.80);
        humano.envelhecer();
        humano.engordar(10);
        humano.emagrecer(1);

        TV televisao = new TV(10,101);
        televisao.abaixarVolume(102);
        televisao.aumentarVolume(99);
        televisao.setCanal(501);

        Bichinho bicho = new Bichinho("Kodo",true,false,8);
        bicho.setNome("Jota");
        bicho.setFome(Boolean.TRUE);
        bicho.setSaude(Boolean.FALSE);
        bicho.setIdade(9);

        bombaCombustivel bomba = new bombaCombustivel("Gasolina Comum",3.79,100);
        bomba.abastecerPorLitro();
        
        
        
        
    }
    
}