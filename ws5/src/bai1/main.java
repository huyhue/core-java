package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int choice, i = 0;
//        ArrayList<PhoneNumber> arr = new ArrayList<>();
//        ArrayList<IntPhoneNumber> arr1 = new ArrayList<>();
//    
//        PhoneNumber p1 = new PhoneNumber();
//        IntPhoneNumber p2 =new IntPhoneNumber();
//
//        System.out.println("Enter list of phone numbers");
//        System.out.println("----------------------------------------------");
//        
//        do{
//            System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 - exit):  ");
//            choice = sc.nextInt();
//            switch(choice){
//                case 1:
//                    p1.enter(); 
//                    arr.add(p1);
//                    break;
//                case 2:
//                    p2.enter(); 
//                    arr1.add(p2);
//                    break; 
//            }
//        }while(choice != 0 && choice < 3);
//        System.out.println("List of phone number:");
//        System.out.println("----------------------------------------------");
//            for(int i = 0; i<arr.size();i++){
//                arr.get(i).display();
//            }
//             for(int i = 0; i<arr1.size();i++){
//                arr1.get(i).display();
//            }   
    PhoneNumber phoneList[] = new PhoneNumber[1000];
    int i=0, choice;
    boolean x=true;
    do{
        System.out.print("Type of phone number ? (1 - local phone, 2 - Inter phone number, 0 - exit):  ");
        choice = sc.nextInt();
        switch(choice){
          
            case 1:        
                System.out.print("Enter area code: ");
                int area = sc.nextInt();
                System.out.print("Enter number: ");
                String number = sc.next();
                phoneList[i] = new PhoneNumber(area,number);i++;
                break;
            case 2:
                System.out.print("Enter country code: ");
                String countryCode = sc.next();
                System.out.print("Enter area code: ");
                int are = sc.nextInt();
                System.out.print("Enter number: ");
                String numbe = sc.next();
                phoneList[i] = new IntPhoneNumber(countryCode, are, numbe);
                i++;
                break;
            default: break;
        }
    }while(choice>0&&choice<3);
    
        for(PhoneNumber p: phoneList){
            p.display();
        }



    }
}
