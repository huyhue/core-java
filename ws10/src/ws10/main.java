package ws10;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarList carlist = new CarList();
        System.out.println("1. Add new item ");
        System.out.println("2. Display all items ");
        System.out.println("3. The number of item ");
        System.out.println("4. Check and return whether a is empty or not");
        System.out.println("5. Remove the item at the position");
        System.out.println("6. Sort as descending by price and display all items");
        System.out.println("7. Check and return wherther c is exists in a or not");
        
        while(true){
            System.out.print("Please choice: ");
            int choice = sc.nextInt();
            switch(choice){
            case 1:
                carlist.addItem();
                break;
            case 2:
                carlist.displayItem();
                break;
            case 3:
                carlist.getSize();
                break;
            case 4:
                carlist.checkEmpty();
                break;
            case 5:
                carlist.deleteItem();
                break;
            case 6:
                carlist.sortItem();
                break;
            case 7:
                carlist.searchItem();
                break;
            default:
                System.err.println("Bye bye...");
                System.exit(1);
            }
        }
    }
    
}
