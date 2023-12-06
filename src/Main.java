import Enteties.Product;

import java.util.ArrayList;
import java.util.List;

//ESERCIZIO 1

public class Main {
    public static void main(String[] args) {
        Product clienteA=new Product("Libro","Books",23);
        Product clienteB=new Product("Il Ritratto di Dorian Grey","Books",55);
        Product clienteC=new Product("Acciaio","Adventure",1000);
        Product clienteD=new Product("DragonHeart","Books",100000);
        List<Product>client =new ArrayList<>();
        client.add(clienteA);
        client.add(clienteB);
        client.add(clienteC);
        client.add(clienteD);

        client.stream().filter(n->n.getPrice() > 100).filter(n->n.getCategory().equals("Books")).forEach(n->{
            System.out.println("questi sono i prezzi maggiori di cento "+ n.getName() +" "+n.getPrice() +" Euro"+" e fa parte della categoria "+n.getCategory());
        });




    }
}