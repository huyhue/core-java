package ws8;

import java.io.Serializable;
import java.util.Scanner;

public class student implements Serializable{
    private String name;
    private int age;
    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public student() {
    }
    public String toString() {
        return "Name:"+name+", Age: "+age + ", Mark: "+ mark+ "\n";
    }

}
