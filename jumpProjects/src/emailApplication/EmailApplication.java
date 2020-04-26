package emailApplication;

import emailApplication.Email;

public class EmailApplication {

	public static void main(String[] args) {
		Email em1 = new Email("Michael", "Scott");
		System.out.println(em1.showInfo());
		
		//Email em2 = new Email("Dwight", "Schrute");
		//System.out.println(em2.showInfo());
		
		//Email em3 = new Email("Jim", "Halpert");
		//System.out.println(em3.showInfo());

	}

}