/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSoThu;

import java.util.ArrayList;
import java.util.Scanner;

public class TestZoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        ArrayList<Chuong> danhSachChuong = new ArrayList<Chuong>();
        
        Chuong c = new Chuong();
        Zoo zoo = new Zoo();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Cat cat = new Cat();
        
        int n;
        do{
            Menu();
            System.out.println("Moi ban nhap lua chon: ");
            n = Integer.parseInt(sc.nextLine());
            boolean exit = false;
            switch(n){
                case 1:
                    System.out.println("1. Them chuong");
                    
                    System.out.println("Ma chuong: ");
                    int maChuong = Integer.parseInt(sc.nextLine());
                    c = new Chuong();
                    zoo.themChuong(c, maChuong);
                    danhSachChuong = zoo.getZoo();
                    break;
                case 2:
                    System.out.println("2. Xoa chuong");
                    
                    System.out.println("Moi ban nhap ma chuong muon xoa");
                    int ma = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < danhSachChuong.size(); i++) {
                        if(danhSachChuong.get(i).getMaChuong() == ma){
                            zoo.xoaChuong(ma);
                        }else{
                            System.out.println("Khong co chuong nao");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Them con vat");
                    System.out.println("Moi ban nhap ma chuong: ");
                    int flag_1 = 2;
                    int maChuong_ = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < danhSachChuong.size(); i++) {
                        if(maChuong_ == danhSachChuong.get(i).maChuong)
                            flag_1 = 1;
                    }
                    if(flag_1 == 1){
                        c = new Chuong();
                        animalList = c.getChuong();
                        System.out.println("Nhapc con vat 1.Tiger, 2.Dog, 3.Cat : ");
                        int ten = Integer.parseInt(sc.nextLine());
                        
                        if(ten == 1){
                            System.out.println("Ten: ");
                            String Ten = sc.nextLine();
                            System.out.println("Tuoi: ");
                            int Tuoi = Integer.parseInt(sc.nextLine());
                            System.out.println("Mo ta: ");
                            String MoTa = sc.nextLine();
                            tiger.Add(Ten, Tuoi, MoTa);
                            c.themConVat(tiger);
                            animalList = c.getChuong();
                            zoo.capNhatChuong(maChuong_, animalList, tiger);
                        }
                        if(ten == 2){
                            System.out.println("Ten: ");
                            String Ten = sc.nextLine();
                            System.out.println("Tuoi: ");
                            int Tuoi = Integer.parseInt(sc.nextLine());
                            System.out.println("Mo ta: ");
                            String MoTa = sc.nextLine();
                            dog.Add(Ten, Tuoi, MoTa);
                            c.themConVat(dog);
                            animalList = c.getChuong();
                            zoo.capNhatChuong(maChuong_, animalList, dog);
                        }
                        if(ten == 3){
                            System.out.println("Ten: ");
                            String Ten = sc.nextLine();
                            System.out.println("Tuoi: ");
                            int Tuoi = Integer.parseInt(sc.nextLine());
                            System.out.println("Mo ta: ");
                            String MoTa = sc.nextLine();
                            dog.Add(Ten, Tuoi, MoTa);
                            c.themConVat(cat);
                            animalList = c.getChuong();
                            zoo.capNhatChuong(maChuong_, animalList, cat);
                        }
                    }else{
                        System.out.println("Khong co chuong nao ");
                    }
                    break;
                case 4:
                    System.out.println("4. Xoa con vat");
                    System.out.println("Nhap ma chuong chua con vat muon xoa");
                    int maChuong2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap ten con vat vua tao: ");
                    String ten = sc.nextLine();
                    String choicemn = sc.nextLine();
                    switch(choicemn){
                        case "1":
                            for (int i = 0; i < danhSachChuong.size(); i++) {
                                if(danhSachChuong.get(i).maChuong == maChuong2){
                                    for (int j = 0; j < danhSachChuong.size(); j++) {
                                        if(danhSachChuong.get(i).animalList.get(i).ten.equals(ten) == true){
                                            danhSachChuong.get(i).animalList.remove(j);
                                        }
                                        
                                    }
                                }
                            }
                        case "2":
                            c.xoaConVat(dog);
                            break;
                        case "3":
                            c.xoaConVat(cat);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("5. Xem tat ca cac con vat");
                    for (int i = 0; i < danhSachChuong.size(); i++) {
                        System.out.println(danhSachChuong.get(i).maChuong);
                        ArrayList<Animal> list = danhSachChuong.get(i).animalList;
                        System.out.println("------------------------------------------");
                        for (int j = 0; j < danhSachChuong.get(i).animalList.size(); j++) {
                            System.out.println(danhSachChuong.get(i).animalList.get(j).ten);
                            System.out.println(list.get(j).tuoi);
                            System.out.println(list.get(j).moTa);
                            list.get(j).tiengKeu();
                        }
                        System.out.println("------------------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Good bye!");
                    exit = true;
                    break;
                default:
                    System.err.println("Nhap sai! Moi nhap lai.");
                    break;
            }
            
        }while(n!=6);
        
        
    }
    static void Menu(){
        System.out.println("=========================");
        System.out.println("1. Them chuong");
        System.out.println("2. Xoa chuong");
        System.out.println("3. Them con vat");
        System.out.println("4. Xoa con vat");
        System.out.println("5. Xem tat ca cac con vat");
        System.out.println("6. Thoat");
        System.out.println("=========================");
    }
}
