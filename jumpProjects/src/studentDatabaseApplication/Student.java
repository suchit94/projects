package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600; 
	private static int id = 1000;
	
	//constructor: prompt user to enter students name and year
	public Student() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter students first name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter students last name: ");
		this.lastName = in.nextLine();
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nenter students grade level: ");
		this.gradeLevel = in.nextInt();
		
		setStudentId();
		
	}
	//generate an id
	private void setStudentId() {
		//grade level + Id
		id++;
		studentId = gradeLevel + "" + id; //makeshift string argument
	}
	//enroll in courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) { 
				courses = courses + "\n -> " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {break;}
		} while(1 != 0);
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt()
;		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	//show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeLevel +
				"\nStudent ID: " + studentId +
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
	}
 
}