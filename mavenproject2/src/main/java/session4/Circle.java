/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String bgColor,double radius) {
        super(bgColor);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI *Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    
}
