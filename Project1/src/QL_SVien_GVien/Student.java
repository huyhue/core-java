package QL_SVien_GVien;

import java.util.Scanner;

public class Student extends Person{
    private String masv;
    private double dtb;
    private String email;

    public Student() {
    }

    public Student(String masv, double dtb, String email) {
        super();
        this.masv = masv;
        this.dtb = dtb;
        this.email = email;
    }

    public String getMasv() {
        return masv;
    }

    public boolean setMasv(String masv) {
        if(masv != null && masv.length() == 8){
            this.masv = masv;
            return true;
        }else{
            System.err.println("Moi ban nhap lai ma sinh vien (do dai = 8 ki tu): ");
            return false;
        }
        
    }

    public double getDtb() {
        return dtb;
    }

    public boolean setDtb(double dtb) {
        if (dtb >=0 && dtb <=10) {
            this.dtb = dtb;
            return true;
        }else{
            System.err.println("Moi ban nhap lai diem trung binh");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && !email.contains("") && email.contains("@")) {
            this.email = email;
            return true;
        }else{
            System.err.println("Moi ban nhap lai email(email khong de trong, khong chua khoang trang va chua dau @): ");
            return false;
        }
    }
    
    public boolean checkScholarship(){
        if(dtb > 8.0){
            return true;
        }
        return false;
    }
    
    
    
    Scanner sc = new Scanner(System.in);
    public void inputInfo(){
        super.inputInfo();
        System.out.print("Nhap ma sinh vien: ");
        while(true){
            String id = sc.next();
            boolean check = setMasv(id);
            if(check){
                break;
            }
        }
        System.out.print("Nhap diem trung binh: ");
        while(true){
            double mark = Double.parseDouble(sc.next());
            boolean check = setDtb(mark);
            if(check){
                break;
            }
        }
        System.out.print("Nhap email: ");
        while(true){
            String emaill = sc.next();
            boolean check = setEmail(emaill);
            if(check){
                break;
            }
        }
    }
    
    public void showInfo(){
        super.showInfo();
        System.out.println("Ma sinh vien: "+masv);
        System.out.println("Diem trung binh: "+dtb);
        System.out.println("Email: "+email);
        System.out.println();
    }
}
