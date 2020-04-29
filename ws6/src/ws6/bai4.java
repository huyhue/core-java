package ws6;
public class bai4 {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

///*1*/   result.setCharAt(0, original.charAt(0));        //result ="si"
///*2*/   result.setCharAt(1, original.charAt(original.length()-1));       //result ="he"
///*3*/   result.insert(1, original.charAt(4));       //result ="hwi"
///*4*/   result.append(original.substring(1,4));       //result ="hioft"
/*5*/   result.insert(2,(original.substring(index, index+2) + " "));       //result ="hiar "
        System.out.println(result);

    }
}
