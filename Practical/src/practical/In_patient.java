package practical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class In_patient extends Patient{
    private double dailyFee;
    private Date dischargedDate; //ngay xuat vien

    Scanner sc = new Scanner(System.in);
    public In_patient input(){
        super.inputt();
        System.out.print("Enter Daily Fee: ");
        dailyFee = sc.nextDouble();
        System.out.print("Enter Discharged Date: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String s = sc.next();
        try {
            dischargedDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new In_patient(dailyFee, dischargedDate, getCode(), getFullname(), getHospitalizedDate(), isGender(), getMedicineCost());
    }
    
    public In_patient() {
    }

    public In_patient(double dailyFee, Date dischargedDate, String code, String fullname, Date hospitalizedDate, boolean gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, gender, medicineCost);
        this.dailyFee = dailyFee;
        this.dischargedDate = dischargedDate;
    }

    public double getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }

    public Date getDischargedDate() {
        return dischargedDate;
    }

    public void setDischargedDate(Date dischargedDate) {
        this.dischargedDate = dischargedDate;
    }
    
    public double medicalFee(){
        return getMedicineCost()*numberOfDates();
    }
    
    public long numberOfDates(){
        return (this.dischargedDate.getTime() - getDischargedDate().getTime()) /1000/60/60/24;
    }
    
    public double hospitalFee(){
        return dailyFee * numberOfDates() + medicalFee();
    }

    @Override
    public String toString() {
        return super.toString() + ", dailyFee= " + dailyFee + ", dischargedDate= " + dischargedDate;
    }
    
    
}
