package session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IProject p = new MyProject();
        p.addProject(new Project("CMS", "FPTU", 2017));
        p.addProject(new Project("Uniap", "FUGHL", 2016));
        p.addProject(new Project("eTicket", "FPT-HCM", 2015));
        p.print();
        
        System.out.println("List of project started in 2016");
        p.listProjectByYear(2016);
        p.sortByStarted();
        p.print();
        
        p.sortByName();
        p.print();
        
        
        List<String> s = new ArrayList<>();
        s.add("xin chao");
        s.add("chao");
        s.add("hello");
        s.add("ciao");
        Collections.sort(s);
        System.out.println(s);
        System.out.println("Min = "+ Collections.min(s));
        Collections.reverse(s);
        System.out.println(s);
        Collections.swap(s, 0, 2);
        System.out.println(s);
    }
}
