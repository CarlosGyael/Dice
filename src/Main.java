
public class Main {
	
	static Time OneSec = new Time();
	static Player Username = new Player();
	static menu start = new menu();
	
	public static void main(String[] args) {
		
		start.menu();
		System.out.println("");
		System.out.println("Please enter a username:");
		
		Username.UserInput();
		
		System.out.println(Username.Username + " will now be taken to the main menu");
		
		
	}

}
