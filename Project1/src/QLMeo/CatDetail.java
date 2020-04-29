/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLMeo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CatDetail implements Cat{
    String loai;
    String mau;
    String noisong;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    public CatDetail() {
    }

    
    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai: ");
        loai = sc.nextLine();
        System.out.println("Nhap mau: ");
        mau = sc.nextLine();
        System.out.println("Nhap noi song: ");
        noisong = sc.nextLine();
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CatDetail{" + "loai=" + loai + ", mau=" + mau + ", noisong=" + noisong + '}';
    }
    
public void adđ(CatDetail catDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
