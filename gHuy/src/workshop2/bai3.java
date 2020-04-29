package workshop2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float n;
        String result = "";
        System.out.println("Enter Average grade: ");
        n = scanner.nextFloat();
        if(n < 5){
            result = "bad";
        }else if(n >= 5 && n < 7){
            result = "average";
        }else if(n >= 7 && n < 8){
            result = "good";
        }else if(n >= 8 && n < 9){
            result = "very good";
        }else{
            result = "excellent";
        }
       System.out.println("Ranking: " + result);
    }
}
