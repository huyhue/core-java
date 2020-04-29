
package assignment;

import java.util.Date;
import java.util.Scanner;

public class InternationalTour extends tour implements ITour{
    private double aviationTax;
    private double entryFee;
    public static Scanner sc = new Scanner(System.in);

    public InternationalTour(double aviationTax, double entryFee, String code, String title, double price, String transport, Date start, Date end) {
        super(code, title, price, transport, start, end);
        this.aviationTax = aviationTax;
        this.entryFee = entryFee;
    }

    public InternationalTour() {
    }
    
    
    public double getAviationTax() {
        return aviationTax;
    }

    public void setAviationTax(double aviationTax) {
        this.aviationTax = aviationTax;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }
    
    public double tourCharge(){
        return surcharge() + getPrice();
    }
    public double surcharge(){
        return aviationTax + entryFee;
    }
    
    public InternationalTour input(){
        super.inputT();
        System.out.print("Enter tour aviation tax: ");
        setAviationTax(Validation.checkInputDouble());
        System.out.print("Enter tour entry fee: ");
        setEntryFee(Validation.checkInputDouble());
        return new InternationalTour(getAviationTax(),getEntryFee(), getCode(), getTitle(), getPrice(), getTransport(), getStart(), getEnd());
    }

   
}
