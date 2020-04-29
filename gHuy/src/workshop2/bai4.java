package workshop2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money: ");
        int n = scanner.nextInt();
        int nam = 0, hai = 0, mot = 0;
                System.out.println("prints out ways to get specified money from $1, $2, and $5 currencies.: ");
        if(n >= 5){
            nam=n/5;
            n=n%5;
            System.out.println("have $5: "+ nam);
        } if(n >= 2){
            hai=n/2;
            n=n%2;
            System.out.println("have $2: "+ hai);
        } if(n >= 1){
            mot=n/1;
            n = n%1;
            System.out.println("have $1: "+ mot);
        }
        
        


    }
}
