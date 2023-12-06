package Enteties;

import java.util.Random;

public class Customer {
    private long id;
    private  String name;

    private int tier;


    public Customer(String name,int tier){
      this.name=name;
      this.tier=tier;
      Random randomizzato=new Random();
      this.id=randomizzato.nextLong(1,100001);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
