/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLiSach;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TacGia {
    String tenTG;
    String Butdanh;
    String Sinh;

    public TacGia() {
    }

    public TacGia(String tenTG, String Butdanh, String Sinh) {
        this.tenTG = tenTG;
        this.Butdanh = Butdanh;
        this.Sinh = Sinh;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getButdanh() {
        return Butdanh;
    }

    public void setButdanh(String Butdanh) {
        this.Butdanh = Butdanh;
    }

    public String getSinh() {
        return Sinh;
    }

    public void setSinh(String Sinh) {
        this.Sinh = Sinh;
    }

    @Override
    public String toString() {
        return "TacGia{" + "tenTG=" + tenTG + ", Butdanh=" + Butdanh + ", Sinh=" + Sinh + '}';
    }
    
    public void inputTG(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("tên tác giả: ");
        tenTG = nhap.nextLine();
        System.out.print("bút danh: ");
        Butdanh = nhap.nextLine();
        System.out.print("ngày sinh: ");
        Sinh = nhap.nextLine();
    }
    
    public void outputTG(){
        System.out.println(toString());
    }
        
}
