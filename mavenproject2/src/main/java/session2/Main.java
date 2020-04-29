package session2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1, s2;
        s1= new Student("mo",2);
        s1.intro();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String na = sc.nextLine();
        System.out.println("Enter semester");
        int se = sc.nextInt();
        s2 = new Student(na,se);
        s2.intro();
        
        Student[] students = new Student[2];
        for(int i=0;i<students.length;i++){
            System.out.println("Enter name");
            String n = sc.nextLine();
            System.out.println("Enter semester");
            int s = sc.nextInt();
            students[i] = new Student(n,s);
        }
        
        int k;
        System.out.println("Enter k = ");
        k = sc.nextInt();
        for(Student x: students){
            if(x.getSemester() == k){
                x.intro();
            }
        }
        
        
    }
}
