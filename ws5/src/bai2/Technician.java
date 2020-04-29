package bai2;

import java.util.Calendar;

public class Technician extends Employee{
    private String work;
    public static double yearReward = 50000;

    public Technician(String work, String employeeID, String fullName, double salaryCofficient, int workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCofficient, workStartDate, gender);
        this.work = work;
    }

    
    public int numberofyear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) - getWorkStartDate();
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
    public double seniorityallowance(){
        return yearSeniorityAllowance * numberofyear();
    }
     public double salary(){
         return salaryCofficient*basicSalary +this.seniorityallowance();
     }
     public double reward(){
         return yearReward*numberofyear();
     }
    
    
    
    
}
