package practical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PatientList {
    ArrayList<Patient> listPa = new ArrayList<Patient>();
    static Scanner sc = new Scanner(System.in);
    public void addPatient(){
        int num;
	do {
		System.out.println("1. Add Patient In");
		System.out.println("2. Add Patient Out");
            	System.out.println("3. Exit");
		num = sc.nextInt();
		switch(num) {
                    case 1:
			In_patient in = new In_patient();
			listPa.add(in.input());
			break;
                    case 2:
			Out_patient out = new Out_patient();
			listPa.add(out.input());
			break;
                    default:
                        break;
		}
	}while(num!=3);
    }
    
    //Compute the hospital’s fee average of all the in-patients
    public double inpatientFeeAverage(){
        double sum = 0;
        int count = 0;
        for(Patient e: listPa){
            if(e instanceof In_patient){
                sum += ((In_patient) e).hospitalFee();
                count++;
            }
        }
        return sum/count;
    }
    
    //List out-patient information including hospital’s fee
    public void outpatientList(){
        ArrayList<Patient> m = new ArrayList<Patient>();
        for(Patient e: listPa){
            if(e instanceof Out_patient){
                m.add(e);
            }
        }
         for (Patient e : m) {
             System.out.println(e);
             e.hospitalFee();
        }
    }
    
    //Search the patient by specified patient code
    public Patient searchCode(String code){
        for(Patient v: listPa)
            if(code.equals(v.getCode()))
                return v;
        return null;
    }
    
    //Search the last occurrence of the patient having minimum hospital’s fee
    public Patient lastHospitalFeeMin(){
        Patient min = listPa.get(0);
        for(Patient e: listPa){
            if(e.hospitalFee()>min.hospitalFee()){
                min = e;
            }
        }
        return min;
    }
    
    //Remove the in-patients released from hospital after specified date
    public static Date d;
    public void removeInpatients(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Enter specified date: ");
        String s = sc.next();
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        for(Patient p: listPa){
            if(p instanceof In_patient){
                if(d.compareTo(((In_patient) p).getDischargedDate()) <= 0){
                    listPa.remove(p);
                }
            }
        }
        System.out.println("Remove success...");
    }   
    
    
    public static void main(String[] args) {
        PatientList pt = new PatientList();
        int choice;
        System.out.println("1. Add new patients to the AsrrayList");
        System.out.println("2. Compute the hospital’s fee average of all the in-patients");
        System.out.println("3. List out-patient information including hospital’s fee");
        System.out.println("4. Search the patient by specified patient code");
        System.out.println("5. Search the last occurrence of the patient having minimum hospital’s fee");
        System.out.println("6. Remove the in-patients released from hospital after specified date");
        do{
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    pt.addPatient();
                    break;
                case 2:
                    System.out.println("The hospital’s fee average of all the in-patients: "+pt.inpatientFeeAverage());
                    break;
                case 3:
                    pt.outpatientList();
                    break;
                case 4:
                    System.out.println("Enter search code: ");
                    String code = sc.next();
                    if(pt.searchCode(code) != null){
                        System.out.println("EXISTING...");
                    }else{
                        System.out.println("NOT FOUND...");
                    }
                    break;
                case 5:
                    System.out.println("Search the last occurrence of the patient having minimum hospital’s fee: " + pt.lastHospitalFeeMin());
                    break;
                case 6:
                    pt.removeInpatients();
                case 7:
                    System.out.println("Exiting program. BYE BYE!!!");
                    System.exit(1);
                default:
                    System.err.println("Nhap sai! Moi ban nhap lai lua chon");
                    break;
            }
        }while(choice != 7);
        
        
    }
}
