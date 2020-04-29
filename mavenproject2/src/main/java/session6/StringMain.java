package session6;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
//        String s = "the";
//        StringBuffer sb = new StringBuffer(s);
//        sb.append(" quick");
//        sb.append(" fox ");
//        sb.append(2018);
//        int i = sb.indexOf("fox");
//        sb.insert(i, "fire");
//        sb.setCharAt(0,'T');
//        s = sb.toString();
//        System.out.println(s);
//        sb.deleteCharAt(0);
//        System.out.println(sb);
        
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s1 = sc.nextLine();
        System.out.println("Enter another string: ");
        s2 = sc.nextLine();
        int count = 0;
        
//        while(s1.indexOf(s2) != -1){
//            int i = s1.indexOf(s2);
//            if(i != -1){
//                count++;
//                StringBuffer sb = new StringBuffer(s1);
//                sb.delete(i, s2.length()+1);
//                s1 = sb.toString();
//            }
//        }
//        System.out.println(s1);
//        System.out.println(count);
        
        int i=-1;
        while((i = s1.indexOf(s2, i+1)) != -1){
            count++;
        }
        System.out.println(count);
        
        String[] st = s1.split("\\s+");
        Arrays.sort(st);
        System.out.println(st);
        
        i = s1.indexOf(s2);
        StringBuffer sb = new StringBuffer(s1).delete(i, i+1);
        s1=s1.toString();
        System.out.println(s1);
        
    }
}
