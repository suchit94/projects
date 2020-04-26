package studentDatabaseApplication;

import java.util.Scanner; 

public class StudentApplication {

	public static void main(String[] args) {
		
		//ask how many students we want to add
		System.out.println("Enter number of new students enrolled: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//create n number of students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition(); 
		}
		for(int n = 0; n < numOfStudents; n++) { 
			System.out.println(students[n].showInfo());
		}
	}
}