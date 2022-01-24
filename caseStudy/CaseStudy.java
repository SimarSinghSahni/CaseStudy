package caseStudy;

import java.util.*;

class Person{
	private String name ;
	private String dateOfBirth;
	private String gender ;
	private String mobileNumber ;
	private String bloodGroup;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}

class Donor extends Person{
	private String bloodBankName ;
	private String donorType ;
	private String donationDate ;
	public String getBloodBankName() {
		return bloodBankName;
	}
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	public String getDonerType() {
		return donorType;
	}
	public void setDonerType(String donerType) {
		this.donorType = donerType;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public void displayDonationDetails() {
		
		System.out.println("Donation Details : ");
		System.out.println("Name : "+getName());
		System.out.println("Date Of Birth : "+getDateOfBirth());
		System.out.println("Gender : "+getGender());
		System.out.println("Mobile Number : "+getMobileNumber());
		System.out.println("Blood Group : "+getBloodGroup());
		System.out.println("Blood Bank Name : "+getBloodBankName());
		System.out.println("Donor Type : "+getDonerType());
		System.out.println("Donation Type : " + getDonationDate());
 
	}
}

public class CaseStudy{

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	    
		Donor d= new Donor();
		
		System.out.println("Enter the name :");
		String name = sc.next();
		d.setName(name);
		
		System.out.println("Enter Date Of Birth :");
		String dateOfBirth = sc.next();
		d.setDateOfBirth(dateOfBirth);
		
		System.out.println("Enter Gender :");
		String gender = sc.next();
		d.setGender(gender);
		
		System.out.println("Enter Mobile Number :");
		String mobileNumber = sc.next();
		d.setMobileNumber(mobileNumber);
		
		System.out.println("Enter Blood Group :");
		String bloodGroup = sc.next();
		d.setBloodGroup(bloodGroup);
		
		System.out.println("Enter Blood Bank Name :");
		String bloodBankName = sc.next();
		d.setBloodBankName(bloodBankName);
		
		System.out.println("Enter Donor Type :");
		String donorType = sc.next();
		d.setDonerType(donorType);
		
		System.out.println("Enter Donation Date :");
		String donationDate = sc.next();
		d.setDonationDate(donationDate);
		
		
		d.displayDonationDetails();
	}

}
