package bai3;

import java.util.ArrayList;

public class DSGV {
    private ArrayList<GiangVien> m = new ArrayList<GiangVien>();
    
    //tra ve danh sach giang vien
    public ArrayList<GiangVien> getDS() {
        return m;
    }
    //tra ve giang vien thu i
    public GiangVien getPT(int i) {
        return m.get(i);
    }
    public void them(GiangVien v){
        m.add(v);
    }
    public void xoa(GiangVien v){
        m.remove(v);
    }
    //chen giang vien vao vi tri thu i
    public void chen(int i, GiangVien v){
        m.add(i, v);
    }
    //tim giang vien co ho ten chi dinh
    public String timHoTen(String hoten){
        String s="";
        for(GiangVien v:m){
            if(hoten.equals(v.getHoTen()))
                s+=v.toString()+"\n";
            return s;
    }
    //tim gv co ho ten chi dinh tra ve ArrayList
    //xuat table
    public ArrayList<GiangVien> timHoTenArr(String hoTen){
        ArrayList<GiangVien> ds = new ArrayList<GiangVien>();
        for(GiangVien v:m){
            if(hoTen.equals(v.getHoTen()))
                ds.add(v);
            return ds;
        }
    }
    //xoa cac giang vien co huu vao lam
    //dung ngay chi dinh
    public void xoaNgayVao(Date ngay){
        for(int i=0;i<m.size();i++){
            if(m.get(i) instanceof GVCoHuu)
                if(((GVCoHuu.m.get(i)).getNgayVao().compareTo(ngay))==0)
                    m.remove(i);
        } 
    }
    public GiangVien MaxLuong(){
        int max = 0;
        for(int i=0;i<m.size();i++){
            if(m.get(i).luong() >m.get(max).luong())
                max = i;
            return m.get(max);
        }
    }
    //hien tri danh sach gv ke ca luong, phu cap
    public void hienThi(){
        String s="";
        for(GiangVien v:m){
            s+=v.toString()+",Luong="+v.luong()+"\n";
            
        }
        return s;
    }
}
 
}
 