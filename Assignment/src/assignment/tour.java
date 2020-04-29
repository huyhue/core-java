/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.tourManager.sc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public abstract class tour implements Serializable{
    private String code;
    private String title;
    private double price;
    private String transport;
    private Date start;
    private Date end;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public tour() {
    }

    public tour(String code, String title, double price, String transport, Date start, Date end) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.transport = transport;
        this.start = start;
        this.end = end;
    }
    public void inputT(){
        System.out.print("Enter tour's code: ");
        setCode(Validation.checkInputCode());
        System.out.print("Enter tour's tile: ");
        title = Validation.checkInputString();
        System.out.print("Enter tour's price: ");
        price = Validation.checkInputDouble();
        System.out.print("Enter tour's transport: ");
        transport = Validation.checkInputString();
        System.out.print("Enter tour's start date: ");
        start = Validation.checkInputDate();
        System.out.print("Enter tour's end date: ");
        end = Validation.checkInputDate();
    }
    
    public long NumberOfYear() {
		return this.end.getTime()/86400000 - this.start.getTime()/86400000;
    }
    
    public abstract double tourCharge();
}
