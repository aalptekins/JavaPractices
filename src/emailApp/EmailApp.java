package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("Abdurrahman", "Alptekin");
		
		em1.setAlternateEmail("aalptekin@gmail.com");
		System.out.println(em1.showInfo());
		
	}
}
