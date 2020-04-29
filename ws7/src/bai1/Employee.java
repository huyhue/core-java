package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Employee implements IEmployee{
    protected String employeeID;
    protected String fullName;
    protected double salaryCofficient;
    protected Date workStartDate;
    protected boolean gender;
    public static double basicSalary = 1490000;
    public static double yearSeniorityAllowance = 100000;

    Scanner sc = new Scanner(System.in);
    public void inputt(){
        System.out.print("Enter ID: ");
        employeeID = sc.next();
        System.out.print("Enter full name: ");
        fullName = sc.next();
        System.out.print("Enter salary cofficient: ");
        salaryCofficient = sc.nextDouble();
        System.out.print("Enter gender(male = true, female = false): ");
        gender = sc.nextBoolean();
        System.out.print("Enter work start date: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String s = sc.next();
        try {
            workStartDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public Employee() {
        super();
    }

    public Employee(String employeeID, String fullName, double salaryCofficient, Date workStartDate, boolean gender) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salaryCofficient = salaryCofficient;
        this.workStartDate = workStartDate;
        this.gender = gender;
    }
    

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalaryCofficient() {
        return salaryCofficient;
    }

    public void setSalaryCofficient(double salaryCofficient) {
        this.salaryCofficient = salaryCofficient;
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static double getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(double basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    public static double getYearSeniorityAllowance() {
        return yearSeniorityAllowance;
    }

    public static void setYearSeniorityAllowance(double yearSeniorityAllowance) {
        Employee.yearSeniorityAllowance = yearSeniorityAllowance;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        return "\nemployeeID: " + employeeID + "\nfullName: " + fullName + "\nsalaryCofficient: " + salaryCofficient + "\nworkStartDate: " + df.format(workStartDate) + "\ngender: " + (gender?"male":"female");
    }
    public long numberOfYear(){
        return (Calendar.getInstance().getTime().getTime()-this.workStartDate.getTime()) /1000/60/60/24/365;
    }
    public double seniorityAllowance(){
        return this.numberOfYear() * Employee.yearSeniorityAllowance;
    }
    public abstract double reward();
}
