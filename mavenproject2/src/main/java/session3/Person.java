/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

/**
 *
 * @author ASUS
 */
public class Person {
    private String name;
    public Person(){
        name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void print(){
        System.out.println("Person saying...");
    }
}
