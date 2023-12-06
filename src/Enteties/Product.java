package Enteties;

import java.util.Random;

public class Product {

    private String name;
    private String category;
    private long id;
    private double price;


    public Product(String name,String category,double price){
      this.name=name;
      this.category=category;
      Random codice=new Random();
      this.id=codice.nextLong(1,1000001);
      this.price=price;
    }

    //codice.nextDouble(1,101);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
