/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public abstract class Person implements Mammal{
        private String firstName;
	private BloodGroup blood;
	private Address homeAddress;
	private Address schoolAddress;
	
	public BloodGroup getBlood() {
		return blood;
	}

	public void setBlood(BloodGroup blood) {
		this.blood = blood;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub

	}

	public int getAgesAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}
