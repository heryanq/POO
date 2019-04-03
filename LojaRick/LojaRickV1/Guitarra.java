package lojarickv1;

public class Guitarra {
    
    private String serialNumber; 
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;
    
    public Guitarra(String xserialNumber, double xprice, String xbuilder, String xmodel, String xtype, String xbackWood, String xtopWood) {
        this.serialNumber = xserialNumber;
        this.price = xprice;
        this.builder = xbuilder;
        this.model = xmodel;
        this.type = type;
        this.backWood = xbackWood;
        this.topWood = xtopWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   
    
}

