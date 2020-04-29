package bai1;

import java.util.Scanner;

public class PhoneNumber{
    protected int area;
    protected String number;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumber(int area, String number) {
        super();
        this.area = area;
        this.number = number;
    }

    public PhoneNumber() {
        super();
    }
    public void display(){
        System.out.println(this.area+" - "+this.number);
    }
    
    
    
    
    
}
