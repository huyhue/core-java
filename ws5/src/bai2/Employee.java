package bai2;

import java.util.Date;

public abstract class Employee implements IEmployee{
    protected String employeeID;
    protected String fullName;
    protected double salaryCofficient;
    protected int workStartDate;
    protected boolean gender;
    public static double basicSalary = 1490000;
    public static double yearSeniorityAllowance = 100000;

    public Employee() {
        super();
    }

    public Employee(String employeeID, String fullName, double salaryCofficient, int workStartDate, boolean gender) {
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

    public int getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(int workStartDate) {
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
        return "\nemployeeID: " + employeeID + "\nfullName: " + fullName + "\nsalaryCofficient: " + salaryCofficient + "\nworkStartDate: " + workStartDate + "\ngender: " + gender;
    }
    public abstract double reward();
}
