package QL_SVien_GVien;

import java.util.Date;
import java.util.Scanner;

public class Person {
    private String ten;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;

    public Person() {
    }

    public Person(String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        System.out.print("Nhap ten: ");
        ten = sc.next();
        System.out.print("Nhap gioi tinh: ");
        gioitinh = sc.next();
        System.out.print("Nhap ngay sinh: ");
        ngaysinh = sc.next();
        System.out.print("Nhap dia chi: ");
        diachi = sc.next();
    }
    
    public void showInfo(){
        System.out.println("--------------------------------");
        System.out.println("Ten: "+ten);
        System.out.println("Gioi tinh: "+gioitinh);
        System.out.println("Ngay sinh: "+ngaysinh);
        System.out.println("Dia chi: "+diachi);
    }
    
}
