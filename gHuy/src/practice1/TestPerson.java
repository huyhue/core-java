package practice1;

import java.util.ArrayList;
import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
		ArrayList<Person>dsPerson=new ArrayList<Person>();
		Person an=new Man() {
                    @Override
                    public void setDayOfBirth(Date dob) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
		an.setFirstName("AN");
		
		Person hong=new Woman() {
                    @Override
                    public void setDayOfBirth(Date dob) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
		hong.setFirstName("Hồng");
		((Woman)hong).setWearingMakup(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p : dsPerson)
		{
			if(p instanceof Man)
			{
				System.out.println(p.getFirstName()+" là Nam");
			}
			else if(p instanceof Woman)
			{
				System.out.println(p.getFirstName()+" là Nữ");
			}
		}
	}

    
    
}
