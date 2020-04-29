package QLSoThu;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong {
    Scanner sc = new Scanner(System.in);
    
    int maChuong;

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }
    
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    
    void themConVat(Animal a){
        animalList.add(a);
    }
    
    void xoaConVat(Animal a){
        animalList.remove(a);
    }

    public ArrayList<Animal> getChuong() {
        return animalList;
    }
    
}
