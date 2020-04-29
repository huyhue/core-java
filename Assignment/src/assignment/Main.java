package assignment;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        tourManager tourma = new tourManager();
        showMenu();
        
        while(true){
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    tourma.addTour();
                    break;
                case 2:
                    tourma.listDomestic();
                    break;
                case 3:
                    tourma.averageInternationTour();
                    break;
                case 4:
                    tourma.search();
                    break;
                case 5:
                    tourma.searchminTourCharge();
                    break;
                case 6:
                    tourma.removeCode();
                    break;
                case 7:
                    tourma.removeStart();
                    break;
                case 8:
                    tourma.sortt();
                    break;
                case 9:
                    tourma.updateTour();
                    break;
                case 10:
                    tourma.fileTour();
                    break;
                case 11:
                    System.out.println("Exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! Please choose action in below menu: ");
                    break;
            }
            if(exit){
                    break;
             }
                showMenu();
        }   
    }
    public static void showMenu(){
            System.out.println("=============================MENU==============================================================================================");
            System.out.println("1. Add new tours to the list");
            System.out.println("2. List all domestic tours in the system.");
            System.out.println("3. Compute the average tour charge of all international tours");
            System.out.println("4. Search tour by code, title, start date, transport");
            System.out.println("5. Search the first occurrence of the tour having minimum tour charge");
            System.out.println("6. Remove the tour having given code");
            System.out.println("7. Romove tours with start date after the specified date");
            System.out.println("8. Sort all tours of list by multiple levels in descending order of tour’s price and then in ascending order of tour’s title");
            System.out.println("9. Update tour information");
            System.out.println("10. Save/ Load tours to/ from file");
            System.out.println("11. Exit program");
            System.out.print("Select your choice: ");
    }
}
