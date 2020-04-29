package atom;

import java.util.Scanner;

public class Atom {
    public int number;
    public String symbol;
    public String fullname;
    public float weight;
    
    public void accept(){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter atomic number: ");
                number = scanner.nextInt();
                System.out.println("Enter symbol: ");
                symbol = scanner.next();
                System.out.println("Enter full name: ");
                fullname = scanner.next();
                System.out.println("Enter atomic weight: ");
                weight = scanner.nextFloat();
    }

 
    public void display(){
         System.out.println(number+ "   " + symbol + "   " + fullname+"   " + weight);
    }
}
