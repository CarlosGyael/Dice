
public class Main {
	
	static Time OneSec = new Time();
	static UserPlayer Username = new UserPlayer();

	public static void main(String[] args) {
		
		System.out.println("Welcome to Dice Game!");
		
		OneSec.OneSecond();
		
		System.out.println("Please enter a username:");
		
		Username.UserInput();
		
		System.out.println(Username.Username + " will now be taken to the main menu");
		
		
	}

}
