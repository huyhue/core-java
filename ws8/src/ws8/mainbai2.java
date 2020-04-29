package ws8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class mainbai2 {
       public static void menu(){
        System.out.println("1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                add();
                break;
            case 2:
                load();
                break;
            default:
                System.err.println("Bye bye !!!");
                System.exit(0);
                break;
        }
    }
      
       public static void load(){
           try{
               ObjectInputStream oi = new ObjectInputStream(new FileInputStream("student.txt"));
               student st = (student)oi.readObject();
               System.out.println(st);
               oi.close();
           }catch(Exception ex){
               ex.printStackTrace();
           }
       }
       public static void add(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter name:");
           String name=sc.next();
           System.out.println("Enter age:");
           int age = sc.nextInt();
           System.out.println("Enter mark:");
           int mark = sc.nextInt();
           student st = new student(name, age, mark);
           try {
               ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("student.txt"));
               o.writeObject(st);
               o.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
}
