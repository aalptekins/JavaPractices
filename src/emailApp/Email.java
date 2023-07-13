package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "elmak.com.tr";
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=8;

	// Constructor to receive the firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department -return the department
		this.department=setDepartment();
		System.out.println("EMAIL CREATED for : " + this.firstName + " " + this.lastName+"\nDepartment: "+this.department);
		email = generateEmail(firstName, lastName);
		System.out.println("Your email address:"+email);
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
	
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the department");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		switch (depChoice) {
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		case 0:
			return "None";
		}
		return "None";
	}
	
	// Create email
	private String generateEmail(String firstName,String lastName) {
		return firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+companySuffix;
	}
	// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$?.*/";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set the mailbox Capacity
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	// Set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "\n"+"\n"+"DISPLAY NAME: " + firstName + " " + lastName + "\n"+
				"COMPANY EMAIL: " + email+"\n"+
				"MAILBOX CAPACITY: " + mailBoxCapacity+ " mb";
	}
	

}
