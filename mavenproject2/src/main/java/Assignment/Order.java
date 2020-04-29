package Assignment;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Order extends Product{
    private String customerId;
    private String orderId;
    private String date;
    private String name;
    private String address;
    private String nameProduct;
    private String idProduct;
    private double price;
    private int quantity;
    
    List<Order> a = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public Order() {
    }

    public Order(String customerId, String orderId, String date, String name, String address, String nameProduct, String idProduct, double price) {
        super(nameProduct, idProduct, price);
        this.customerId = customerId;
        this.orderId = orderId;
        this.date = date;
        this.name = name;
        this.address = address;
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    //check customer id valid
    public boolean checkCustomerId(String customerId){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getCustomerId().equals(customerId)){
                return true;
            }
        }
        return false;
    }
    
    //input order Id by Customer Id
    public void inputCustomerId(){
        do{
            System.out.println("Enter Customer Id: ");
            String checkCustomerId = sc.nextLine();
            if(checkCustomerId(checkCustomerId) == false){
                System.out.println("Not found Customer Id");
                continue;
            }else{
                printInformationCustomerId(checkCustomerId);
                break;
            }
        }while(true);
    }
    
    //Print date
    public void printDate(Order o2){
        DecimalFormat def = new DecimalFormat("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        o2.setDate(def.format(localDate));
        System.out.println("Order Date: "+def.format(localDate));
    }
    
    
    //Add an order
    public void addOrder(Order o){
        a.add(o);
        System.out.println("Add order success!!!");
    }
    
    //Check order id valid
    public boolean checkOrderId(String orderId){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getOrderId().equals(orderId)){
                return true;
            }
        }
        return false;
    }
    
    //Input Order Id by Order Id
    public void inputOrderId(){
        do{
            System.out.println("Enter Order Id: ");
            String checkOrderId = sc.nextLine();
            if(checkOrderId(checkOrderId)==false){
                System.out.println("Not found Order Id");
                continue;
            }else{
                printInformationOrderId(checkOrderId);
                break;
            }
        }while(true);
    }
    
    //Print list order
    public void printOrder(){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Order ID","Customer ID","Name Customer","Product ID","Product Name","Date","Address","Quantity","Price");
        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).orderId, a.get(i).customerId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
        }
    }
    
    //Print information of an Order by Order Id
    public void printInformationOrderId(String checkOrderId){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Order ID","Customer ID","Name Customer","Product ID","Product Name","Date","Address","Quantity","Price");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getOrderId().equals(checkOrderId)){
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).orderId, a.get(i).customerId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
                return;
            }  
        }
    }
    
    //Print information of an Order by Customer Id
    public void printInformationCustomerId(String checkCustomerId){
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Order ID","Customer ID","Name Customer","Product ID","Product Name","Date","Address","Quantity","Price");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getCustomerId().equals(checkCustomerId)){
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15.2f\n", a.get(i).orderId, a.get(i).customerId, a.get(i).name, a.get(i).idProduct, a.get(i).nameProduct, a.get(i).date, a.get(i).address, a.get(i).quantity, a.get(i).price * a.get(i).quantity);
            }  
        }
                return;
    }
    
    //Create a new order
    public void inputOrder(Order o2, Product p){
        Random rand = new Random();
        do{
            String checkCustomerId = Integer.toString(rand.nextInt(10000)+1);
            if(checkCustomerId(checkCustomerId)==true){
                continue;
            }else{
                o2.setCustomerId("CTM" + checkCustomerId);
                System.out.println("Customer ID: " + o2.getCustomerId());
                break;
            }
        }while(true);
        
        System.out.println("Enter customer name: ");
        o2.setName(sc.nextLine());
        System.out.println("Enter customer address: ");
        o2.setAddress(sc.nextLine());
        System.out.println("Add product to order by select a product form below list");
        p.printProduct();
        inputProductQuatity(o2, p);
    }
     
    //input product and quatity
    public void inputProductQuatity(Order o2, Product p){
        Random rand = new Random();
        do{
            String checkOrderId = Integer.toString(rand.nextInt(1000)+1);
            if(checkOrderId(checkOrderId)==true){
                continue;
            }else{
                o2.setOrderId("OD"+checkOrderId);
                System.out.println("Order ID: "+o2.getOrderId());
                break;
            }
        }while(true);
        do{
            System.out.println("Enter product ID: ");
            String idProduct = sc.nextLine();
            if(p.checkProductId(idProduct)==false){
                System.out.println("Not found product id");
                continue;
            }else{
                System.out.println("Enter Quatity: ");
                o2.setQuantity(Integer.parseInt(sc.nextLine()));
            }
        }while(true);
    }
    
}
