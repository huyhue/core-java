package session8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Triangle t = new Triangle();
        while(keepGoing){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a: ");
                int a = Integer.valueOf(sc.nextLine());
                System.out.print("Enter b: ");
                int b = Integer.valueOf(sc.nextLine());
                System.out.print("Enter c: ");
                int c = Integer.valueOf(sc.nextLine());
                t = new Triangle(a, b, c);
                keepGoing = false;
            } catch (MyException e) {
                e.printMessage();
            }catch(NumberFormatException e){
                System.out.println("Please enter a correct data");
            }catch(Exception e){
                System.out.println("reEnter values for a, b, c they are not trianglia");
            }
            System.out.println("Thanks you, triagle area is " + t.getArea());
        }
    }
}
