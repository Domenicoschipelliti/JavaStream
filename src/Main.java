import Enteties.Order;
import Enteties.Product;

import java.util.ArrayList;
import java.util.List;

//ESERCIZIO 1

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------PRIMO------------------");

        Product clienteA=new Product("Libro","Baby",23);
        Product clienteB=new Product("Il Ritratto di Dorian Grey","Books",55);
        Product clienteC=new Product("Acciaio","Boys",1000);
        Product clienteD=new Product("DragonHeart","Books",100000);
        List<Product>client =new ArrayList<>();
        client.add(clienteA);
        client.add(clienteB);
        client.add(clienteC);
        client.add(clienteD);

        client.stream().filter(n->n.getPrice() > 100).filter(n->n.getCategory().equals("Books")).forEach(n->{
            System.out.println("questi sono i prezzi maggiori di cento "+ n.getName() +" "+n.getPrice() +" Euro"+" e fa parte della categoria "+n.getCategory());
        });

        System.out.println("--------------------SECONDO------------------");

        Order ordine=new Order(client,"Baby");
        Order order=new Order(client,"Fantasy");
        Order prodotto=new Order(client,"lavoro");

        List<Order>ordinario=new ArrayList<>();

        ordinario.add(ordine);
        ordinario.add(order);
        ordinario.add(prodotto);

        ordinario.stream().filter(n->n.getStatus().equals("Baby")).forEach(n->{
            System.out.println("questi sono della categoria  "+ n.getStatus() + n.getProducts());
        });

        System.out.println("------------TERZO---------------------");

        client.stream().filter(n->n.getCategory().equals("Boys")).forEach(n->{
            n.setPrice(n.getPrice()*10/100);
            System.out.println("questi sono i libri con categoria "+ n.getCategory()+" chiamati "+ n.getName() +" con lo sconto "+n.getPrice()+" euro");
        });







    }
}