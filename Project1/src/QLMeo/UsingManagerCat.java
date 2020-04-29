/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLMeo;

import java.util.Scanner;

public class UsingManagerCat {
    public static void main(String[] args) {
        ManagerCat managerCat = new ManagerCat();
        ColorManager colorManager = new ColorManager();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            showMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0:
                    colorManager.input();
                    break;
                case 1:
                    managerCat.input();
                    break;
                case 2:
                    managerCat.display();
                    break;
                case 3:
                    managerCat.sort();
                    break;
                case 4:
                    managerCat.find();
                    break;
                case 5:
                    colorManager.sort();
                    break;
                case 6:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.err.println("Moi ban nhap lai");
                    break;
            }
        }while(choice != 6);
    }
    public static void showMenu(){
        System.out.println("0. Nhap danh sach ma mau");
        System.out.println("1. Nhap thong tin cua n con meo");
        System.out.println("2. Hien thi thong tin");
        System.out.println("3. Sap xep danh sach theo mau");
        System.out.println("4. Tim kiem thong tin theo loai");
        System.out.println("5. Sap xep danh sach theo bang mau trong lop ColorManager");
        System.out.println("6. Thoat");
        System.out.print("Lua chon: ");
    }
}
