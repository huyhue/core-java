package ws8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai3 {
    public static void main(String[] args) {
        try {
        	BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("D://summary.txt")));
                String s;
            	while ((s = in.readLine())!=null) 
             		System.out.println(s);
                in.close();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
