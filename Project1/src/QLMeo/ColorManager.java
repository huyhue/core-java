/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLMeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ColorManager {
    ArrayList<String> colorList = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public ColorManager() {
    }
    
    public void input(){
        System.out.println("Nhap so mau can them");
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap mau: ");
            String color = sc.nextLine();
            colorList.add(color);
        }
    }
    
    public String ColorList(){
        String mau;
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(i+" Mau: "+colorList.get(i));
        }
        
        int index = Integer.parseInt(sc.nextLine());
        
        mau = colorList.get(index);
        return mau;
    }
    
    public void sort(){
        Collections.sort(colorList);
        ColorList();
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }
    
    
}
