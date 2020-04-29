package assignment;

import java.util.Comparator;

public class sortPrice implements Comparator<tour>{
    public int compare(tour tour1, tour tour2) {
        if(tour1.getPrice()> tour2.getPrice()){
            return -1;
        }
        return 1;
    }
}

