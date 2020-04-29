package ws9;

import java.util.Scanner;


public class Ex1_Ws2 {
    public static void main(String[] args) {
        int a, b, c;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        while (true) {  
            while(check){
                try {
                System.out.print("Enter side a: ");
                a = Integer.valueOf(sc.nextLine());
                System.out.print("Enter side b: ");
                b = Integer.valueOf(sc.nextLine());
                System.out.print("Enter side c: ");
                c = Integer.valueOf(sc.nextLine());
                //call constructor of RightTriangle class
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
                
            } catch (IllegalTriangleException e1) {
                e1.printMessage1();
                check = false;
            } catch (IllegalRightTriangleException e2) {
                e2.printMessage2();
                check = false;
            }catch (NumberFormatException e) {
                System.out.println("Wrong input! Try again!");
            }
            }
            
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = sc.next().charAt(0);
            if(chon != 'Y')
                break;
        }

    }
}
