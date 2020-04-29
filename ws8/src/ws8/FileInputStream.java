package ws8;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        FileReader fis = null;
        FileWriter fos = null;    
        try {
            fis =  new FileReader("test.txt");
            fos = new FileWriter("test1.txt");
            int ch;
            while((ch = fis.read()) != 1){
                System.out.println((char)ch);
                fos.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                fis.close();
            }
            if(fos != null){
                fos.close();
            }
        }
    }

  
}
