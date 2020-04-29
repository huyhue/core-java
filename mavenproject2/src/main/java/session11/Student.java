/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private int semester;

    public Student(String name, int semester) {
        this.name = name;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return name + "\t" + semester;
    }
    
    
}
