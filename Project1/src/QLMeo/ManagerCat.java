package QLMeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerCat {
     ArrayList<CatDetail> catList = new ArrayList<CatDetail>();

    public ManagerCat() {
    }
     
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so meo can them");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            CatDetail catdetail = new CatDetail();
            catdetail.nhap();
            catList.add(catdetail);
        }
    }
    
    public void display(){
        for (int i = 0; i < catList.size(); i++) {
            catList.get(i).hienthi();
        }
    }
    
    public void sort(){
        Collections.sort(catList, new Comparator<CatDetail>(){
            @Override
            public int compare(CatDetail o1, CatDetail o2) {
                return o1.getMau().compareToIgnoreCase(o2.getMau());
            }
        });
        display();
    }
    
    public void find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai can tim kiem");
        String loai = sc.nextLine();
        for (CatDetail catDetail : catList) {
            if(catDetail.getLoai().equalsIgnoreCase(loai)){
                catDetail.hienthi();
            }
        }
    }
    
}
