/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student>{
    public int compare(Student student1, Student student2) {
        if(student1.getGpa() > student2.getGpa()){
            return 1;
        }
        return -1;
    }
    
}
