package ws6;

import java.util.Arrays;
import java.util.Scanner;

public class bai7 {
    public static boolean areAnagrams(String str1, String str2){
        String s1 = remove(str1);
        String s2 = remove(str2);
        
        s1.toLowerCase();
        s2.toLowerCase();
        
        s1 = sort(s1);
        s2 = sort(s2);
        
        return s1.equals(s2);
    }
    public static String sort(String str){
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        return new String(arr);
    }
    public static String remove(String str){
        StringBuilder dest = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)){
                dest.append(c);
            }
        }
        return dest.toString();
    }
    public static void main(String[] args) {
        String str1 = "I am student:";
        String str2 = "student, am I!";
        
        System.out.println("Testing whether the following strings are anagrams:");
        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);
        
        if(areAnagrams(str1, str2)){
            System.out.println("This is anagrams!");
        }else{
            System.out.println("This is NOT anagrams!");
        }      
    }
}
