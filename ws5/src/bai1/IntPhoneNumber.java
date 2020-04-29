package bai1;

import java.util.Scanner;

public class IntPhoneNumber extends PhoneNumber{
    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public IntPhoneNumber() {
        super();
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }
    public void display(){
        System.out.println(this.area+" - "+this.number+" - "+this.countryCode);
    }
}
