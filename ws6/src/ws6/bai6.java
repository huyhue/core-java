package ws6;
public class bai6 {
    static void printInitials(String name){
        if(name.length() == 0) return;
            
        String words[] = name.split(" ");
        for(String word : words){
//            System.out.println(word);
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }
        }
    public static void main(String[] args) {
        String fulname = "tong phuoc gia huy";
        printInitials(fulname);
    }
     
     
}
