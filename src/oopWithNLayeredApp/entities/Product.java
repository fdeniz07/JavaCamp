package oopWithNLayeredApp.entities;

public class Product {

    private int id;
    private String name;
    private double UnitPrice;


    public Product() {
    }

    public Product(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        UnitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }
}
