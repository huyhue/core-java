package ws10;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class CarList implements Comparator<Car>{
    Scanner sc = new Scanner(System.in);
    LinkedList<Car> ll = new LinkedList<Car>();

    public CarList() {
    }
    
    public void addItem(){
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter production: ");
        String production = sc.next();
        Car c = new Car(name, price, production);
        ll.add(c);
    }
    
    public void displayItem(){
        for(Car car: ll){
            System.out.println(car);
        }
    }
    
    public void getSize(){
        System.out.println("The number of items: "+ll.size());
    }
    
    public void checkEmpty(){
        if(ll.isEmpty() == true){
            System.out.println("Empty");
        }else{
             System.out.println("NO Empty");
        }
    }
    
    public void deleteItem(){
        System.out.println("Enter pos: ");
        int pos = sc.nextInt();
        ll.remove(pos);
    }
    
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getPrice() > o2.getPrice()){
            return -1;
        }
        return 1;
    }
    
    public void sortItem(){
        Collections.sort(ll, this);
        displayItem();
    }
    
    public void searchItem(){
        System.out.print("Enter search name : ");
        String name = sc.next();
        System.out.print("Enter search price: ");
        double price = sc.nextDouble();
        System.out.print("Enter search production: ");
        String production = sc.next();
        int index = Collections.binarySearch(ll, new Car(name, price, production), this);
        if(index == -1){
           System.out.println("NO Existing in information");
        }else{
           System.out.println("Existing in information");
        }
        
    }

    
}
