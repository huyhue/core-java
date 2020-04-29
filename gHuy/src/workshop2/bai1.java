package workshop2;

import static ghuy.bai6.scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai1 {
    public static void input(int array[],int n){
        System.out.println("- Input data : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }
    public static void output(int array[], int n){
        System.out.println("\nDisplay all elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void average(int array[], int n){
        int sum = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 2 !=  0){
                sum += array[i];
                ++m;
            }
        }
            System.out.println("\nComputes the average of odd array elements: " + sum/m );
    }
    public static void lmax(int array[], int n){
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nFind the last maximum element: " + max );
    }
    public static void last(int array[], int n){
        System.out.println("\nFinds the last array element having specified value: " + array[n-1] );
    }
    public static void sort(int array[], int n){
        int temp;
        for (int i = 0; i < n - 1; i++) {
        for (int j = n - 1; j >= 1; j--) 
            if (array[j] < array[j - 1]) {
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        output(array,n);
    }
    public static void del(int array[], int n){
        int c, i;
        System.out.println("\nEnter a specified index k: ");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (i != k) {
                array[c] = array[i];
                c++;
            }
        }     
    n = c;    
    System.out.println("\nDelete an element at a specified index ");
    output(array,n);
    }
    public static void insert(int array[], int n){
        System.out.println("\nEnter a specified index k: ");
        int k = scanner.nextInt();
        System.out.println("\nEnter value at a specified index : ");
        int val = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == k) {
                array[i] = val;
            }
        }     
    output(array,n);
    }
    public static void count(int array[], int n){
        int m = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 3 ==  0 && array[i] % 7 ==  0){
                ++m;
            }
        }
            System.out.println("\nCounts the integers that divided by 3 and 7 with no remainder : " + m );
    }
    public static void sum(int array[], int n){
        float sum = array[0];
        for (int i = 1; i < n; i++) {
           sum = (float) (sum + array[i]/pow(i+1,2));
        }
            System.out.println("\nComputes the following sum, with m0, m1, m2… are the array elements: " + sum);
    }
      public static void sumc(int array[], int n){
        double sum = 0;
        for (int i = 0; i < n; i++) {
           sum = sum + sqrt(array[i]);
        }
            System.out.println("\nComputes the sum of square roots of the array prime elements: " + sum);
    } 
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
    int array[] = new int[n];
    input(array,n);
    output(array,n);
    average(array,n);
    lmax(array,n);
    last(array,n);
    sort(array,n);
    del(array,n);
    insert(array,n);
    count(array,n);
    sum(array,n);
    sumc(array,n);
}
    
}
