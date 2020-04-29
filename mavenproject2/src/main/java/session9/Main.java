package session9;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List a = new Vector();
        a.add(true);
        a.add("ciao");
        a.add(Integer.valueOf("165"));
        a.remove(0);
        int i = a.indexOf("ciao");
        a.remove(i);
        a.add(a.get(0));
        a.add(a.contains(166));
        Iterator it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
