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
public class Sach {
    String tenSach;
    String ButdanhTG;
    String NXB;

    public Sach() {
    }

    public Sach(String tenSach, String ButdanhTG, String NXB) {
        this.tenSach = tenSach;
        this.ButdanhTG = ButdanhTG;
        this.NXB = NXB;
    }
    
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getButdanhTG() {
        return ButdanhTG;
    }

    public void setButdanhTG(String ButdanhTG) {
        this.ButdanhTG = ButdanhTG;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "Sach{" + "tenSach=" + tenSach + ", ButdanhTG=" + ButdanhTG + ", NXB=" + NXB + '}';
    }
    
    public void inputS() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("tên Sach: ");
        tenSach = nhap.nextLine();
        System.out.print("bút danh tg: ");
        ButdanhTG = nhap.nextLine();
        System.out.print("NXB: ");
        NXB = nhap.nextLine();
    }

    public void outputS() {
        System.out.println(toString());
    }
    
    
    
}
