/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Product implements Comparable<Product>{
    private String name;
    private String id;
    private double price;
    List<Product> a = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public Product() {
    }

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //add new product in store
    public void addProduct(Product p){ 
        a.add(p);
        System.out.println("Add a product success!!!");
    }
    
    //check product id valid 
    public boolean checkProductId(String productId){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId().equals(productId)){
                return true;
            }
        }
        return false;
    }
    
    //print product id
    public void printProductId(Product p2){
        Random rand = new Random();
        do{
            String checkProductId = Integer.toString(rand.nextInt(1000) + 1);
            if(checkProductId(checkProductId) == true){
                continue;
            }else{
                p2.setId(checkProductId);
                System.out.println("Product ID: " + checkProductId);
                break;
            }
        }while(true);
    }
    
    //input information of product
    public void inputProduct(Product p2){
        Random rand = new Random();
        System.out.println("Enter name: ");
        p2.setName(sc.nextLine());
        System.out.println("Enter price: ");
        p2.setPrice(Double.parseDouble(sc.nextLine()));
    }
    
    //input update price for product
    public void inputProductId(Product p){
        System.out.println("Enter product id: ");
        String productId = sc.nextLine();
        if(p.checkProductId(productId)==false){
            System.out.println("Not found product id");
            return;
        }
        System.out.println("Enter new price: ");
        double newPrice = Double.parseDouble(sc.nextLine());
        p.updatePrice(productId, newPrice);
    }
    
    //Get name id to print in order
    public String getNameProduct(String productId){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId().equals(productId)){
                return a.get(i).name;
            }
        }
        return null;
    }
    
    //Get price id to print in order
    public double getPriceProduct(String productId){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId().equals(productId)){
                return a.get(i).price;
            }
        }
        return 0;
    }
    
    //Update price of product
    public void updatePrice(String productId, double newPrice){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId().equals(productId)){
                a.get(i).setPrice(newPrice);
                System.out.println("Update sucess!!!");
                return;
            }
        }
    }
    
    //Print product
    public void printProduct(){
        System.out.printf("%-15s%-15s%-15s\n","Product ID","Product Name","Product Price");
        for (int i = 0; i < a.size(); i++) {
             System.out.printf("%-15s%-15s%-15.2f\n",a.get(i).getId(),a.get(i).getName(),a.get(i).getPrice());
        }
    }
    
    //Sort all products by Price
    public void sortByPrice(){
        Collections.sort(a);
    }
    
    public int compareTo(Product o){
        return Double.toString(this.price).compareTo(Double.toString(o.price));
    }
      
}
