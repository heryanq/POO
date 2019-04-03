package lojarickv1;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Inventario {
    
    private List guitarras;
    
    public Inventario() {
        guitarras = new LinkedList();
    }
    
    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood) {
        Guitarra guitarra = new Guitarra(serialNumber, price, builder, model, type, backWood, topWood);
        guitarras.add(guitarra);
    }
    
    public Guitarra getGuitarra(String serialNumber) {
        for (Iterator i = guitarras.iterator(); i.hasNext();) {
            Guitarra guitarra = (Guitarra)i.next();
            if (guitarra.getSerialNumber().equals(serialNumber)) {
                return guitarra;
            }   
        }
        return null;
    }
}
