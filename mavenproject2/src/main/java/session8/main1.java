package session8;

import java.util.Scanner;

public class main1 {
    static void print(String s) throws MyException, Exception{
        if(s==null) throw new MyException("Parameter cannot be null");
    }
    public static void main(String[] args) {
        boolean keepGoing = true;
        double mark = 0;
        while(keepGoing){
            System.out.println("Enter a student mark: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            try {
//                print(null);
                mark = Double.valueOf(s);
                if(mark < 0 || mark > 10){
                    throw new MyException("Student mark must be in rangeof [0-10] ok");
                }
                keepGoing = false;
            } catch (MyException e) {
                e.printMessage();
            }catch (Exception e) {
                System.out.println("Student mark must be a numeric");//neu sai thi nhac loi
            }
            System.out.println("Thanks you, your mark is " + mark);
            
            
        }
    }
    
}
