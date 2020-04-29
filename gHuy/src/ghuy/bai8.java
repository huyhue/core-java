package ghuy;

import java.util.Scanner;

public class bai8 {
    //viet phuong thuc cho biet x co phai la so nguyen to hay khong ?nhap so x, kiem tra x co phai la so nguyen to khong
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.println("Nhap vao so nguyen to: ");
        p = sc.nextInt();
        if(isPrimeNumber(p)== true){
            System.out.println("Day la so nguyen to: ");
        }else{
            System.out.println("Day khong phai so nguyen to: ");
        }

    }
}
