/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical;

import java.text.ParseException;
import java.util.Date;

public class Out_patient extends Patient{
    private double examinationFee;
    private double testingFee;

    public Out_patient input(){
        super.inputt();
        System.out.print("Enter Examination Fee: ");
        examinationFee = sc.nextDouble();
        System.out.print("Enter Testing Fee: ");
        testingFee = sc.nextDouble();
        return new Out_patient(examinationFee, testingFee, getCode(), getFullname(), getHospitalizedDate(), isGender(), getMedicineCost());
    }
    
    public Out_patient() {
    }

    public Out_patient(double examinationFee, double testingFee, String code, String fullname, Date hospitalizedDate, boolean gender, double medicineCost) {
        super(code, fullname, hospitalizedDate, gender, medicineCost);
        this.examinationFee = examinationFee;
        this.testingFee = testingFee;
    }

    

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

    public double getTestingFee() {
        return testingFee;
    }

    public void setTestingFee(double testingFee) {
        this.testingFee = testingFee;
    }
    
    public double medicalFee(){
        return getMedicineCost();
    }
    
    public double hospitalFee(){
        return examinationFee+testingFee+medicalFee();
    }

    @Override
    public String toString() {
        return super.toString() + ", examinationFee= " + examinationFee + ", testingFee= " + testingFee;
    }
    
    
}
