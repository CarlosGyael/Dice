import java.util.Scanner;

public class UserPlayer{
	
	public String Username;
	int choice = 0;
	

	Scanner keyboard = new Scanner( System.in );
	
	Time OneSec = new Time();
	
	public void UserInput(){
	
		this.Username = keyboard.next();
	
	
	}
	
	public void PlayerIntro(){

		System.out.println("Please enter a username:");
		
		UserInput();
		
		System.out.println("Hello " + Username + " Nice of you to play. ");
		
		
	}
	
	
}
