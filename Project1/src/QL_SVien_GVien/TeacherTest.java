package QL_SVien_GVien;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> listTeachers = new ArrayList<Teacher>();
        int choose;
        boolean exit = false;
        do{
            menu();
            System.out.println("Moi ban nhap lua chon: ");
            choose = Integer.parseInt(sc.nextLine());
            
            switch(choose){
                case 1:
                    System.out.println("1. Nhap vao n giang vien");

                    System.out.println("Moi ban nhap so giang vien muon them: ");
                    int n = Integer.parseInt(sc.nextLine());
				
                    for(int i = 0; i < n; i++) {
                        Teacher teacher = new Teacher();
                        teacher.inputInfo();
                        listTeachers.add(teacher);
                    }
                    break;
                case 2:
                    System.out.println("2. Hien thi thong tin tat ca cac giang vien ");
                    for(Teacher t : listTeachers) {
                        t.showInfo();
                    }                    
                    break;
                case 3:
                    System.out.println("3. Hien thi giang vien co luong cao nhat");
				
                    int maxIndex = 0;
                    double maxSalary;
                    maxSalary = listTeachers.get(0).tinhLuong();
				
                    for(int i = 0; i < listTeachers.size(); i++) {
                    if(listTeachers.get(i).tinhLuong() > maxSalary) {
                            maxIndex = i;
                            maxSalary = listTeachers.get(i).tinhLuong();
                        }
                    }
				
                    System.out.println("Giang vien co luong cao nhat: ");
                    listTeachers.get(maxIndex).showInfo();
                    break;
                case 4:
                    System.out.println("Good bye!!!");
                    exit = true;
                    break;
                default:
                        System.err.println("Nhap sai! Moi ban nhap lai lua chon");
                        break; 
            }
        }while(choose != 4);
    }

    private static void menu() {
        System.out.println("===========================================");
        System.out.println("1. Nhap vao n giang vien");
        System.out.println("2. Hien thi thong tin tat ca cac giang vien");
        System.out.println("3. Hien thi giang vien co luong cao nhat");
        System.out.println("4. Thoat");
        System.out.println("===========================================");
    }
}
