package ExercicioInterfaces;

public class Main{

    public static void main(String[] args) {
        
        Triatleta triAt = new Triatleta("Rodrigo", "Rua Getúlio Vargas");
        System.out.println(triAt.getNome());
        System.out.println(triAt.getEndereco());
        triAt.aquecer();
        triAt.correr();
        triAt.pedalar();
        triAt.nadar();
    }
}