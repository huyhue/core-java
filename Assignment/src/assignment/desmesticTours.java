package assignment;

import java.util.Date;
import java.util.Scanner;

public class desmesticTours extends tour implements ITour{
    
    private double tourGuideTip;
    public static Scanner sc = new Scanner(System.in);

    public desmesticTours() {
    }

    public desmesticTours(double tourGuideTip, String code, String title, double price, String transport, Date start, Date end) {
        super(code, title, price, transport, start, end);
        this.tourGuideTip = tourGuideTip;
    }
  
    public double tourCharge(){
        return surcharge() + getPrice();
    }
    public double surcharge(){
        return tourGuideTip * NumberOfYear();
    }
    public desmesticTours input(){
        super.inputT();
        System.out.print("Enter tour guide tip: ");
        tourGuideTip = Validation.checkInputDouble();
        return new desmesticTours(tourGuideTip, getCode(), getTitle(), getPrice(), getTransport(), getStart(), getEnd());
    }
    
}
