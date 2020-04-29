package bai1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Manager extends Employee{
    private String position;
    private double positionAllowance;
    public static double yearReward = 100000;
    
    Scanner sc = new Scanner(System.in);
    public Manager input(){
        super.inputt();
        System.out.print("Enter position: ");
        position = sc.next();
        System.out.print("Enter position allowance: ");
        positionAllowance = sc.nextDouble();
        return new Manager(position, positionAllowance, employeeID, fullName, salaryCofficient, workStartDate, gender);
    }
    
    public Manager(String position, double positionAllowance, String employeeID, String fullName, double salaryCofficient, Date workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCofficient, workStartDate, gender);
        this.position = position;
        this.positionAllowance = positionAllowance;
    }
    public Manager() {
        super();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    @Override
    public String toString() {
        return "Employee manager have infomation:   " + "\nposition: " + position +"\npositionAllowance: " + positionAllowance + super.toString()+"\nsalary: "+ this.salary()+"\nreward: "+ this.reward();
    }
      public double salary(){
         return this.salaryCofficient*Employee.basicSalary +this.seniorityAllowance()+getPositionAllowance();
     }
     public double reward(){
         return this.numberOfYear()* Manager.yearReward;
     }
}
