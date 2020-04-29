package ws8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Nhap file nguon: ");
        String fn1 = bf.readLine();
        File f1 = new File(fn1);
        System.out.print("\n Nhap file muon luu: ");
        String fn2 = bf.readLine();
        File f2 = new File(fn2);
        FileInputStream fi = new FileInputStream(f1);
        FileOutputStream fo = new FileOutputStream(f2);

        int i;
        while((i = fi.read()) != -1){
                i = i+3;
                //System.out.println((char)i);
                 //copy to f2
                fo.write(i);
        }
        fi.close();
        fo.close();
    }
}
