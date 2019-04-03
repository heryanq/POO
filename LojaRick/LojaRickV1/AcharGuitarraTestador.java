package lojarickv1;

public class AcharGuitarraTestador {
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        initializeInventario(inventario);
    }
    
    private static void initializeInventario(Inventario inventario) {
        inventario.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
        }
    
    Guitarra whatErinLikes = new Guitarra("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
	    Guitarra guitarra = inventario.search(whatErinLikes);
	    if (guitarra != null) {
	      System.out.println("Erin, acha que você pode gostar desta " +
	        guitarra.getBuilder() + " " + guitarra.getModel() +  " " +
	        guitarra.getType() + " Guitarra:\n   " +
	        guitarra.getBackWood() + " atrás e lados,\n   " +
	        guitarra.getTopWood() + " top.\nVocê pode levar por apenas $" +
	        guitarra.getPrice() + "!");
	    } else {
	      System.out.println("Desculpa, Erin, no momento não temos o que vocẽ deseja.");
	    }

	}

    
}
