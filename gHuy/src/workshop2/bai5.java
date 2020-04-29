package workshop2;

import java.util.Scanner;

public class bai5 {
   public static float luyThua(int n, int k) {
    int pow = 1;
    for (int i = 1; i <= k; i++)
        pow *= n;
    return (float)pow;
    }
    public static float giaiThua(int n) {
        int giaithua = 1;
        for (int i = 1; i <= n; i++)
            giaithua *= i;
        return (float)giaithua;
    } 
     public static void main(String[] args) {
         float sum = 0;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter x:");
         int x = scanner.nextInt();
         System.out.println("Enter n:");
         int n = scanner.nextInt();
         for (int i = 0; i <= n; i++) {
             sum += luyThua(x, i) / giaiThua(i);
         }
         System.out.println("sum of e^x :"+ sum);

     }
}
