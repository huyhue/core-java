/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session10;

import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class myDictionary {
    Map<String, String> m = new HashMap<>();
    void create(){
        try {
            RandomAccessFile raf = new RandomAccessFile("D:/mydictionary.txt","rw");
            raf.writeBytes("house=Ngoi nha");
            raf.writeBytes("\n\rcar=Xe o to");
            raf.seek(0);
            String s;
            while((s = raf.readLine())!=null){
                if(!s.isEmpty()){
                    String[] st = s.split("=");
                    m.put(st[0], st[1]);
                }
            }
            raf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void output(){
        Iterator<String>keys = m.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key + "="+m.get(key));
        }
    }
    
    public static void main(String[] args) {
        myDictionary md = new myDictionary();
        md.create();
        md.output();
    }
}
