package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeFileFactory {
    public static boolean savaFile(HashMap<Integer, Contact> csd1, String path){
        try {
            FileOutputStream fos=new  FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(csd1);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
     public static HashMap<Integer, Contact> readFile(String path){
         HashMap<Integer, Contact> csd1= new HashMap<Integer, Contact>();
         try {
             FileInputStream fis= new FileInputStream(path);
         ObjectInputStream ois = new ObjectInputStream(fis);
         Object data = ois.readObject();
         ois.close();
         fis.close();
         csd1= (HashMap<Integer, Contact>)data;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return csd1;
     }

    static void saveFile(HashMap<Integer, Contact> csdl, String dcsdlcontactdat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
