package ss2;
import ss1.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public int grandTotal;
    public String city;
    public ArrayList<Product> dsProduct;

    public Cart(){

    }
    public Cart(int id, String customer, int grandTotal,String city){
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.dsProduct = new ArrayList<>();
    }

    public void ThemProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        int id =scanner.nextInt();
        System.out.println("Nhap vao ten san pham:  ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("So luong: ");
        int qty = scanner.nextInt();
        System.out.println("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine();


        Product product = new Product(id,name,qty,price);
        dsProduct.add(product);
    }

    public void xoaProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao id san pham muon xoa:");
        int id = scanner.nextInt();
        for (int i = 0; i < dsProduct.size(); i++) {
            if(dsProduct.get(i).id == id){
                dsProduct.remove(i);
            }
        }
    }
    public void addtoCart(){

    }
    public void grandTotal(int qty,int price){
        grandTotal = qty*price;
        System.out.println("Tổng tiền hóa đơn:" + grandTotal);
    }
    public static void main(String args[]){
        Cart cart = new Cart();
        cart.ThemProduct();
        cart.xoaProduct();

    }


}
