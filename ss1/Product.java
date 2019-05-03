package ss1;
import java.util.ArrayList;

public class Product {
    public int id;
    public String name;
    public int qty;
    public int price;
    public Product(){

    }
    public Product(int id, String name, int qty, int price){
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;

    }

    public static void main(String args[]){
        Product product = new Product();
        Product[] arrayProduct = new Product[10];
        for (int i = 0; i < 10; i++) {
            arrayProduct[i] = new Product(1,"Ti vi",10,1000000);
        }

        for(Product u: arrayProduct){
            System.out.println("ID: " + u.id);
            System.out.println("Mat Hang: " + u.name);
            System.out.println("So luong: " + u.qty);
            System.out.println("Gia Thanh: " + u.price);
            System.out.println("---------------------");
        }

        ArrayList<Product> Productarray = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Productarray.add(new Product(1,"Ti vi",10,1000000));
        }

        Productarray.remove(2);
        for(Product u: Productarray){
            System.out.println("ID" + u.id);
            System.out.println("Mat Hang: " + u.name);
            System.out.println("So Luong: " + u.qty);
            System.out.println("Gia Thanh: " + u.price);
            System.out.println("----------------------");
        }

    }
}
