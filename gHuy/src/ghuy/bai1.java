package ghuy;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        //nhap vai so nguyen va in ra tong
      Scanner sc = new Scanner(System.in);
//        System.out.println("1.Nhap vai so nguyen va in ra tong");
//        int a ;
//        int s = 0;
//        do{
//            a = sc.nextInt();
//            s += a;    
//        }while(a != 0);
//        System.out.println("Tong la: " + s);
        
         

//        System.out.println("2.Nhap vai so thuc va in ra so duong");
//         int a ;
//        do{
//            a = sc.nextInt();
//            if(a > 0){
//            System.out.println("So duong: " + a);
//            }else{
//            System.out.println("So am: " + a);   
//            }
//        }while(a != 0);


       
//        System.out.println("3.In ra so chinh phuong < 50");
//        int i, j;
//        for(i = 1; i < 50; i++) {
//            for(j = 1; j < i; j++) {
//                if(j*j == i){
//                    System.out.println(i);
//                }
//             }
//          }
        
        
//        System.out.println("4.Giai phuong trinh bac 2 va in ra ket qua");
//        System.out.print("Nhập hệ số bậc 2, a = ");
//        float a = sc.nextFloat();
//        System.out.print("Nhập hệ số bậc 1, b = ");
//        float b = sc.nextFloat();
//        System.out.print("Nhập hằng số tự do, c = ");
//        float c = sc.nextFloat();
//        giaiPTBac2(a, b, c);
        
        System.out.println("5.nhap ten sv. Nhap diem cac mon da hoc trong hk vua qua. in ra man hinh ten va DTB cua SV do");
        System.out.println("Nhap ten sv: ");
        String s = sc.next();
        System.out.println("Nhap diem mon Toan: ");

        }
    
    
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
