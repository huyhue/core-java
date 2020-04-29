package QL_SVien_GVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listStd = new ArrayList<Student>();
        
        int choose;
        boolean exit = false;
        int i;
        do{
            Menu();
            System.out.print("Moi ban nhap lua chon: ");
            choose = Integer.parseInt(sc.nextLine());
            switch(choose){
                case 1:
                    System.out.println("1. Nhap vao n sinh vien");
                    System.out.println("Moi ban nhap so sinh vien can them: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int j = 0; j < n; j++) {
                        Student st = new Student();
                        st.inputInfo();
                        listStd.add(st);
                    }
                    break;
                case 2:
                     System.out.println("2. Hien thi thong tin tat ca sinh vien ra man hinh");
                     for (int j = 0; j < listStd.size(); j++) {
                        listStd.get(j).showInfo();
                    }
                     break;
                case 3:
                     System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat va thap nhat");
                     
                     int minIndex = 0, maxIndex = 0;
                     double minMark, maxMark;
                     
                     
                     minMark = listStd.get(0).getDtb();
                     maxMark = listStd.get(0).getDtb();
                     
                     for (int j = 1; j < listStd.size(); j++) {
                        if(listStd.get(j).getDtb() < minMark){
                            minIndex = j;
                            minMark = listStd.get(j).getDtb();
                        }
                        if(listStd.get(j).getDtb() < maxMark){
                            maxIndex = j;
                            maxMark = listStd.get(j).getDtb();
                        }
                    }
                     
                     System.out.println("Sinh vien co diem cao nhat la: ");
                     listStd.get(maxIndex).showInfo();
                     
                     System.out.println("Sinh vien co diem thap nhat la: ");
                     listStd.get(minIndex).showInfo();
                     break;
                case 4:
                     System.out.println("4. Tim kiem sinh vien theo ma sinh vien");
                     
                     System.out.println("Moi ban nhap ma sinh vien");
                     String id = sc.nextLine();
                     int dem = 0;
                     
                     for(Student st: listStd){
                         if(st.getMasv().equalsIgnoreCase(id)){
                             dem++;
                         }
                     }
                     if(dem==0){
                         System.out.println("Khong tim thay sinh vien nao co id = "+id);
                     }
                     break;
                case 5:
                    System.out.println("5. Hien thi tat ca cac sinh vien theo thu tu ten trong ban chu cai");
                    
                    Collections.sort(listStd, new Comparator<Student>(){
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getTen().compareTo(o2.getTen());
                            if(cmp>=0){
                                return 1;
                            }
                            return -1;    
                        }
                    });
                    for (int j = 0; j < listStd.size(); j++) {
                        listStd.get(j).showInfo();
                    }
                    break;
                case 6:
                    System.out.println("6. Hien thi tat ca sinh vien duoc hoc bong va sap xep theo thu tu diem cao xuong thap");

                    Collections.sort(listStd, new Comparator<Student>(){
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getDtb() >= o2.getDtb() ? -1:1;
                        }
                    });
                    for (int j = 0; j < listStd.size(); j++) {
                        listStd.get(j).showInfo();
                    }
                    break;
                case 7:
                    System.out.println("Good bye !!!");
                    exit = true;
                    break;
                default:
                    System.err.println("Nhap sai! Moi ban nhap lai lua chon");
                    break;
            }
        }while(choose != 7);
    }
    static void Menu(){
            System.out.println("=========================================");
            System.out.println("1. Nhap vao n sinh vien");
            System.out.println("2. Hien thi thong tin tat ca sinh vien ra man hinh");
            System.out.println("3. Hien thi sinh vien co diem trung binh cao nhat va thap nhat");
            System.out.println("4. Tim kiem sinh vien theo ma sinh vien");
            System.out.println("5. Hien thi tat ca cac sinh vien theo thu tu ten trong ban chu cai");
            System.out.println("6. Hien thi tat ca sinh vien duoc hoc bong va sap xep theo thu tu diem cao xuong thap");
            System.out.println("7. Thoat");
            System.out.println("=========================================");
        }
}