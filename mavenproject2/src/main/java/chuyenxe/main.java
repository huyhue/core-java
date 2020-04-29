package chuyenxe;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
ArrayList<chuyenxenopthanh>arrchuyenxenopthanh= new ArrayList<>();
ArrayList<chuyenxengoaithanh>arrchuyenxengoaithanh= new ArrayList<>();
         int soChuyenNoiThanh, soChuyenNgoaiThanh;
        double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chuyến xe nội thành: ");
        soChuyenNoiThanh = scanner.nextInt();
        System.out.print("Nhập số chuyến xe ngoại thành: ");
        soChuyenNgoaiThanh = scanner.nextInt();
        
        System.out.println("Nhập thông tin chuyến xe nội thành:");
        for (int i = 0; i < soChuyenNoiThanh; i++) {
            System.out.println("Nhập thông tin chuyến xe thứ " + (i + 1) + ":");
            chuyenxenopthanh chuyenXeNoiThanh = new chuyenxenopthanh();
            chuyenxenopthanh.nhapthongtinchuyenxe();
            doanhThuXeNoiThanh += chuyenxenopthanh.getDoanhThu();
            arrchuyenxenopthanh.add(chuyenxenopthanh);
        }
    }
}
