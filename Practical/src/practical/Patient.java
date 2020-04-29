package practical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Patient implements IPatient{
    private String code;
    private String fullname;
    private Date hospitalizedDate;
    private boolean gender;
    private double medicineCost;

    Scanner sc = new Scanner(System.in);
    public void inputt(){
        System.out.print("Enter code: ");
        code = sc.next();
        System.out.print("Enter full name: ");
        fullname = sc.next();
        System.out.print("Enter Hospitalized Date: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String s = sc.next();
        try {
            hospitalizedDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("Enter gender(male = true, female = false): ");
        gender = sc.nextBoolean();
        System.out.print("Enter Medicine Cost: ");
        medicineCost = sc.nextDouble();
    }
    
    public Patient() {
    }

    public Patient(String code, String fullname, Date hospitalizedDate, boolean gender, double medicineCost) {
        this.code = code;
        this.fullname = fullname;
        this.hospitalizedDate = hospitalizedDate;
        this.gender = gender;
        this.medicineCost = medicineCost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public void setMedicineCost(double medicineCost) {
        this.medicineCost = medicineCost;
    }

    @Override
    public String toString() {
        return "Patient: " + "code= " + code + ", fullname= " + fullname + ", hospitalizedDate= " + hospitalizedDate + ", gender= " + gender + ", medicineCost= " + medicineCost;
    }

    @Override
    public abstract double hospitalFee();
    
}
