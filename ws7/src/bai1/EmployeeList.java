package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private static Date d;

    public ArrayList<Employee> getList() {
        return list;
    }
    public Employee getEmployee(int i){
        return list.get(i);
    }
    public void addEmployees(){
        int num;
	do {
		System.out.println("1. Add manager");
		System.out.println("2. Add Technician");
            	System.out.println("3. Exit");
		num = sc.nextInt();
		switch(num) {
                    case 1:
			Manager m = new Manager();
			list.add(m.input());
			break;
                    case 2:{
			Technician t = new Technician();
			list.add(t.input());
			break;
			}
		}
	}while(num!=3);
    }
    
    public ArrayList<Employee> managerList(){
        ArrayList<Employee> m = new ArrayList<Employee>();
        for(Employee e: list){
            if(e instanceof Manager){
                m.add(e);
            }
        }
        return m;
    }
    
    public double technicalSalaryAverage(){
        double sum = 0;
        int count = 0;
        for(Employee e: list){
            if(e instanceof Technician){
                sum += ((Technician) e).salary();
                count++;
            }
        }
        return sum/count;
    }
    
    public Employee searchID(String id){
        for(Employee v: list)
            if(id.equals(v.getEmployeeID()))
                return v;
        return null;
    }
    
    public ArrayList<Employee> searchName(String name){
        ArrayList<Employee> elist = new ArrayList<>();
         for(Employee v: list){
            if(name.equals(v.getFullName()))
                elist.add(v);
        }
        return elist;
    }
    public ArrayList<Employee> searchGender(){
        
        System.out.println("Enter search gender: ");
        String gender = sc.next();
        ArrayList<Employee> elist = new ArrayList<>();
         for(Employee v: list){
            if(gender.equals(v.isGender()))
                elist.add(v);
        }
        return elist;
    }
    public ArrayList<Employee> searchDate(){
        ArrayList<Employee>elist = new ArrayList<>();
        SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
	System.out.print("Enter work start date: ");
	String s = sc.next();
	try {
		d = sdf.parse(s);
	} catch (ParseException e) {
		e.printStackTrace();
	}
        for(Employee v: list){
            if(d.compareTo(v.getWorkStartDate())<=0)
                elist.add(v);
        }
        return elist;
    }
    public void removeID(String id){
        for(Employee v : list){
            if(id.equals(v.getEmployeeID()))
                list.remove(v);
                break;
        }
    }
    public void removeDate(Date d){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("Enter work start date: ");
        String s = sc.next();
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for(Employee e: list){
            if(d.equals(e.getWorkStartDate())){
                list.remove(e);
                break;
            }
        }
    }
    public Employee lastSalaryMax(){
        Employee max = list.get(0);
        for(Employee e: list){
            if(e.salary()>max.salary()){
                max = e;
            }
        }
        return max;
    }
    public void updateEmployee() throws ParseException{
        System.out.println("Enter update ID: ");
        String id = sc.next();
        for(Employee e: list){
            if(id.equals(e.getEmployeeID())){
                System.out.print("Enter full name: ");
                e.setFullName(sc.next());
                System.out.print("Enter salary cofficient: ");
                e.setSalaryCofficient(sc.nextDouble());
                System.out.print("Enter gender(male = true, female = false): ");
                e.setGender(sc.nextBoolean());
                System.out.print("Enter work start date: ");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                String d = sc.next();
                e.setWorkStartDate(sdf.parse(d));
            }
        }
    }
    public static void main(String[] args) throws ParseException {
        EmployeeList el = new EmployeeList();
        int choice;
        System.out.println("1. Add employee");
        System.out.println("2. Show manager");
        System.out.println("3. Show salary technician");
        System.out.println("4. Search employee ID");
        System.out.println("5. Search employee Name");
        System.out.println("6. Search employee gender");
        System.out.println("7. Search employee date");
        System.out.println("8. Remove employee ID ");
        System.out.println("9. Remove employee date");
        System.out.println("10. Last Salary Max");
        System.out.println("11. Update Employee");
        do{
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    //add employee
                    el.addEmployees();
                    break;
                case 2:
                    //show manager
                    ArrayList<Employee> m = new ArrayList<Employee>();
                    el.managerList();
                    for (Employee e : m) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    //show salary technician
                    System.out.println("Salary Average Technical is: "+el.technicalSalaryAverage());
                    break;
                case 4:
                    //search employee ID
                    System.out.println("Enter search ID: ");
                    String id = sc.next();
                    if(el.searchID(id) != null){
                        System.out.println("EXISTING...");
                    }else{
                        System.out.println("NOT FOUND...");
                    }
                    break;
                case 5:
                    //search employee Name
                    System.out.println("Enter search full name: ");
                    String fullname = sc.next();
                    if(el.searchName(fullname) != null){
                        System.out.println("EXISTING...");
                    }else{
                        System.out.println("NOT FOUND...");
                    }
                    break;
                case 6:
                    //search employee gender
                     ArrayList<Employee> eList = el.searchGender();
		     if(eList!=null) {
			for(Employee v:eList)
			    System.out.println(v);
		     }else {
		            System.out.print("NOT FOUND");
		     }
                    break;
                case 7:
                    //search employee start work in the date
		    ArrayList<Employee> e = el.searchDate();
		    if(e != null) {
			for(Employee v: e) {
                            System.out.println(v);
			}
		    }else
			System.out.print("NOT FOUND");
                    break;
                case 8:
                    //remove employee ID 
                    System.out.println("Enter remove ID: ");
                    String id1 = sc.next();
                    el.removeID(id1);
                    break;
                case 9:
                    //remove employee data   
                    el.removeDate(d);
                    break;
                case 10:
                    System.out.println("Last salary max is: " + el.lastSalaryMax());
                    break;
                case 11:
                    el.updateEmployee();
                    break;
                case 12:
                    System.out.println("Exiting program. BYE BYE!!!");
                    System.exit(1);
                default:
                    System.err.println("Nhap sai! Moi ban nhap lai lua chon");
                    break;
            }
        }while(choice != 12);
    }
    
}
