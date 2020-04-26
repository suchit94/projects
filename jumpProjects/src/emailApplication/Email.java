package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password; 
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "collabera.com";
	
	//constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("email created: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is: " + this.password);
		
		//combine elements to generate email's
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("your email is: " + email);
	}

	//ask for the department 
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " " + lastName + "\nDEPARTMENT CODES:\n1 for sales\n2 for development\n3 for accounting\n4 for none\nEnter department code: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "development";}
		else if(depChoice == 3) {return "accounting";}
		else {return "";}
		
	}
	
	//generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	//set mailbox capacity. (Not in constructor because its not necessary)
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternate email. (Not in constructor because its not necessary)
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password. (Not in constructor because its not necessary)
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	//this method will return name, email, and mailbox capacity
	public String showInfo() {
		return "EMPLOYEE NAME: " + firstName + " " + lastName +
			   "\nCOMPANY EMAIL: " + email +
			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
	
}