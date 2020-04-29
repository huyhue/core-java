package bai2;

import java.util.Calendar;

public class Manager extends Employee{
    private String position;
    private double positionAllowance;
    public static double yearReward = 100000;

    public Manager(String position, double positionAllowance, String employeeID, String fullName, double salaryCofficient, int workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCofficient, workStartDate, gender);
        this.position = position;
        this.positionAllowance = positionAllowance;
    }

    
    
    
    public int numberofyear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - getWorkStartDate();
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
    
    public double seniorityallowance(){
        return yearSeniorityAllowance * numberofyear();
    }
    public double salary(){
         return salaryCofficient*basicSalary +this.seniorityallowance()+getPositionAllowance();
     }
    public double reward(){
         return yearReward*numberofyear();
     }
}
