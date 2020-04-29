package QLSoThu;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Chuong> danhSachChuong = new ArrayList<Chuong>();

    public Zoo() {
    }
    
    void themChuong(Chuong c, int maChuong){
        c.maChuong = maChuong;
        danhSachChuong.add(c);
    }
    
    void xoaChuong(int maChuong){
        for (int i = 0; i < danhSachChuong.size(); i++) {
            if(danhSachChuong.get(i).getMaChuong() == maChuong){
                danhSachChuong.remove(i);
            }
        }
    }
    
    void capNhatChuong(int maChuong, ArrayList c, Animal a){
        for (int i = 0; i < danhSachChuong.size(); i++) {
            if(danhSachChuong.get(i).getMaChuong() == maChuong){
                danhSachChuong.get(i).animalList.add(a);
            }
            
        }
    }

    public ArrayList<Chuong> getZoo() {
        return danhSachChuong;
    }
    
    
    
    
}
