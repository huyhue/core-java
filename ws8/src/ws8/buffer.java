package ws8;

import java.io.BufferedInputStream;

public class buffer {
    public static void main(String[] args) {
        FileInputStream fis =null; 
        BufferedInputStream bis = null;
        try {
            fis = new FileInputStream("student.txt");
            bis = new BufferedInputStream(fis);
            byte[] data = new byte[1024];
            int length = bis.read(data);
            System.out.println("length: "+length);
            String result = new String(data, 0, length);
            System.out.println(result);
        } catch (Exception e) {
        }
    }
}
