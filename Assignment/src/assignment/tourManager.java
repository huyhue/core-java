package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class tourManager{
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<tour> tourList = new ArrayList<>();
    private tourFile tfile = new tourFile();

    public tourManager() {
        
    }

    public ArrayList<tour> getTourList() {
        return tourList;
    }

    public void setTourList(ArrayList<tour> tourList) {
        this.tourList = tourList;
    }
    
      public tour getTour(int i) {
	return tourList.get(i);
	}
    
    
     //Add new tours to the list
    public void addTour(){
        int num;
	do {
            System.out.println("1.Add desmestic Tours ");
            System.out.println("2.Add International Tour ");
	    System.out.println("3.Eixt");
            num=sc.nextInt();
            switch(num) {
                  case 1:
			desmesticTours d = new desmesticTours();
			tourList.add(d.input());
			break;
                   case 2:{
			InternationalTour i = new InternationalTour();
			tourList.add(i.input());
			break;
			}
		}
	 }while(num != 3);
        System.out.println("Add new tours to the list successing");
    }
    
    //List all domestic tours in the system. 
    public ArrayList<tour> listDomestic(){
        ArrayList<tour> m = new ArrayList<>();
        for(tour v : tourList){
            if(v instanceof desmesticTours) {
                 m.add(v);
            }
	}
	return m;
    }
    
    //Compute the average tour charge of all international tours
    public void averageInternationTour(){
        int count = 0;
        double sum = 0;
        for (tour t : tourList) {
            if (t instanceof InternationalTour) {
                count++;
                sum += t.tourCharge();
            }
        }
        System.out.println("the average tour charge of all international tours: "+sum/count);
        
    }
    
    //Search tour by code, title, start date, transport
    public void search(){
        int num;
	do {
            System.out.println("1.Search code ");
            System.out.println("2.Search title ");
            System.out.println("3.Search start date ");
            System.out.println("4.Search transport ");
	    System.out.println("5.Exit");
            num=sc.nextInt();
            switch(num) {
                  case 1:
			tour e= searchCode();
			if(e!=null){
				System.out.println(e);
			}
                        else System.out.println("NOT FOUND");
			break;
                   case 2:
			ArrayList<tour> eList= searchTitle();
			    if(eList!=null) {
					for(tour v:eList)
					System.out.println(v);
				}
                                else  System.out.println("NOT FOUND");
			break;
                   case 3:
                       ArrayList<tour> eList1 = searchStart();
			    if(eList1!=null) {
					for(tour v:eList1)
					System.out.println(v);
				}
                                else  System.out.println("NOT FOUND");
			break;
                   case 4:
                        ArrayList<tour> eList2 = searchTransport();
			    if(eList2!=null) {
					for(tour v:eList2)
					System.out.println(v);
				}
                                else  System.out.println("NOT FOUND");
			break;
		}
	 }while(num != 5);
    }
    public tour searchCode() {
		tour t = null;
                System.out.print("Enter code search: ");
		String code = sc.next();
		for(tour v: tourList) {
		    if(code.equals(v.getCode())) {
			t= v;
			break;
                    }	
		}
		return t;
   }
	
	
    public  ArrayList<tour> searchTitle() {
		ArrayList<tour> eList= new  ArrayList<>();
		System.out.print("search title:");
		String title = sc.next();
		for(tour v:tourList) {
                    if(title.equals(v.getTitle())) {
				eList.add(v);
                    }
		}
	return eList;
    }
	
    public  ArrayList<tour> searchStart() {
		ArrayList<tour> eList= new  ArrayList<>();
		System.out.print("search start:");
		Date start = Validation.checkInputDate()
		for(tour v : tourList) {
                    if(start.equals(v.getStart())) {
			eList.add(v);
                    }
		}
	return eList;
    }

    public  ArrayList<tour> searchTransport() {
		ArrayList<tour> eList = new  ArrayList<>();
		System.out.print("search transport:");
		String transport = sc.next();
		for(tour v:tourList) {
                    if(transport.equals(v.getTransport())) {
				eList.add(v);
                    }
		}
	return eList;
    }
	
    //Search the first occurrence of the tour having minimum tour charge
    public tour searchminTourCharge(){
        double min = tourList.get(0).tourCharge();
        int pos = 0;
        for (int i = 0; i < tourList.size(); i++) {
            if(tourList.get(i).tourCharge() < min){
                pos = i;
                min = tourList.get(i).tourCharge();
            }
        }
        return getTour(pos);
    }
    
    //Remove the tour having given code
    public void removeCode() {
                String code;
		System.out.print("search code:");
		code=sc.next();
		for(tour v:tourList) {
			if(code.equals(v.getCode())) {
				tourList.remove(v);
				System.out.println("REMOVED");
				break;
			}
		}
	}
    
    //Romove tours with start date after the specified date
    public void removeStart(){
        System.out.print("Search  start date: ");
        Date start = Validation.checkInputDate();
        
        for(tour v : tourList){
            if(start.compareTo(v.getStart())<0){
                tourList.remove(v);
            }
        }
        System.out.println("REMOVED");	
    }
    
    //Sort all tours of list by multiple levels in descending order of tour’s price and then in ascending order of tour’s title

    public void sortt(){
        Collections.sort(tourList, new sortPrice().thenComparing(new sortTitle()));
    }
    
    //Update tour information
    public void updateTour(){
        System.out.print("search Code:");
        String code = sc.next();
        int i=0;
        desmesticTours d = new desmesticTours();
        InternationalTour in = new InternationalTour();
        for(tour v: tourList){
            i++;
            if(code.equals(v.getCode())){
                System.out.println("choose type 1(desmesticTours), 2(InternationalTour): ");
                int c =sc.nextInt();
                if(c == 1){
                    tourList.set(i-1, d.input());
                }
                if(c == 2){
                    tourList.set(i-1, in.input());
                }
                break;
            }
        }
    }
    
    //Save/ Load tours to/ from file
    public void fileTour(){
        System.out.println("please choose 1(save), 2(load): ");
        int c =sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Loading file tour: ");
                tourList = (ArrayList<tour>) tfile.read();
                break;
            case 2:
                System.out.println("Saving file tour: ");
                tfile.write(tourList);
                break;
            default:
                break;
        }
    }
}
