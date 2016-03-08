import java.util.Scanner;

public class UserPlayer extends Player{
	
	String Username;

	Scanner keyboard = new Scanner( System.in );
	
	Time OneSec = new Time();
	
	public String UserInput(){
	
		Username = keyboard.next();
	
		return Username;
	}
	
	public void PlayerIntro(){

		System.out.println("Please enter a username:");
		
		UserInput();
		
		System.out.println(Username + " will now be taken to the main menu");
	}
}
