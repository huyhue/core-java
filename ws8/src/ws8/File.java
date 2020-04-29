package ws8;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {
//        File file = new File("test1.txt");
//        if(file.isFile()){
//            file.delete();
//            System.out.println("File: "+file.getAbsolutePath());
//        }else{
//            System.out.println("Not found");
//            file.createNewFile();
//        }
        DataInputStream dis = new DataInputStream(System.in);        
        System.out.println("Nhap N");
        int n = Integer.parseInt(dis.readLine());
        System.out.println(n);
            
    }
}
