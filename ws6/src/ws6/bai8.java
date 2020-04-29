package ws6;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        
        //cau a
        if(str.contains("me")==true){
            System.out.println("Have me within str");
        }
        if(str.contains("why")==true){
            System.out.println("Have why within str");
        }
        if(str.contains("well")==true){
            System.out.println("Have well within str");
        }
        
        //cau b
        /*int index = str.indexOf("you");
        System.out.println(index);
        int count = 0;
        while (index != -1) {
            count++;
            str = str.substring(index + 1);
            index = str.indexOf("you");
        }
        System.out.println("No of *is* in the input is : " + count);*/
        
        //cau c
        /*String[] split = str.split(" ");
        String result = "";

        for(String word: split){
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(result.trim());*/
        
        //cau d
        
//        e- Extract @str string to an array of words, then display those words by increasing order.
//        f- Give a character named c, remove from @str the first character which is equals to c. 
        int j, count = 0, n = str.length(); 
        char c = 'c';
        char []t = str.toCharArray(); 
        for (int i = j = 0; i < n; i++){ 
            if (t[i] != c) t[j++] = t[i]; 
            else count++; 
        }      
        while(count > 0) { 
            t[j++] = '\0'; 
            count--; 
        } 
        System.out.println(t); 




//        g- Count how many words in @str, display “empty string” if @str is an empty string.   
        /*if(str.isEmpty()){
                System.out.println("empty string");
        }else{
            System.out.println("Have amount words in string:"+str.length());
        }*/



//        h- Print all letters of @str only.
            /*char[] all = str.toCharArray();
            for(int i=0;i < all.length;i++){
                System.out.print(all[i] +" ");
            }*/




//        i- Reserve @str.
        /*char[] reserve = str.toCharArray();
         for (int i = reserve.length-1; i>=0; i--) 
            System.out.print(reserve[i]); */


//        j- Replace all letter ‘a’ by ‘A’ and ‘b’ by ‘B’.
       /* str = str.replaceAll("a", "A");
        str = str.replaceAll("b", "B");
        System.out.println("New string: "+str);*/

        
        //k- How many upper letters in @str?
        /*int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.printf("Have %s upper letters in @str",count);*/
        

    
    
}
    }

