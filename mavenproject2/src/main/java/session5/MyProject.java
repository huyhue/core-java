package session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyProject implements IProject{
    private List<Project> projects;
    private Object Collations;
    
    public MyProject(){
        projects = new ArrayList();
    }
    public void print(){
        System.out.printf("%-10s%-20s%-20s%-15s\n","ID","Name","Sponsor","Start Year");
        for(int i = 0 ;i < projects.size(); i++){
            Project p = projects.get(i);
            System.out.printf("%-10d", i+1 );
            p.display();
        }
    }
    public void addProject(Project p){
        projects.add(p);
    }
    public void listProjectByYear(int year){
        boolean found = false;
        for(int i=0;i<projects.size();i++){
            Project p = projects.get(i);
            if(p.getStarted() == year){
                System.out.printf("%-10d",i+1);
                p.display();
            }
        }
        if(!found){
            System.out.println("Not found any project started in "+year);
        }
    }
    public void sortByStarted(){
        Collections.sort(projects);
    }
    public void sortByName(){
        Collections.sort(projects, new CompareByName());
    }
}
class CompareByName implements Comparator<Project>{
    public int compare(Project o1, Project o2){
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
