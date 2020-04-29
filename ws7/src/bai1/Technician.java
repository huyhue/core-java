package bai1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Technician extends Employee{
    private String work;
    public static double yearReward = 50000;

    Scanner sc = new Scanner(System.in);
    public Technician input(){
        super.inputt();
        System.out.print("Enter work: ");
        work = sc.next();
        return new Technician(work, employeeID, fullName, salaryCofficient, workStartDate, gender);
    }
    public Technician(String work, String employeeID, String fullName, double salaryCofficient,Date workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCofficient, workStartDate, gender);
        this.work = work;
    }

    public Technician() {
        super();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee technician have infomation:   " + "\nwork: " + work + super.toString()+"\nsalary: "+ this.salary()+"\nreward: "+ this.reward();
    }
     public double salary(){
         return this.salaryCofficient*Employee.basicSalary +this.seniorityAllowance();
     }
     public double reward(){
         return this.numberOfYear()* Technician.yearReward;
     }
     
     
    
    
    
    
}
