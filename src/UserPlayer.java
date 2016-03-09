import java.util.Scanner;

public class UserPlayer{
	
	String Username;
	int choice =0;
	

	Scanner keyboard = new Scanner( System.in );
	
	Time OneSec = new Time();
	menu StartUp = new menu();
	
	public String UserInput(){
	
		Username = keyboard.next();
	
		return Username;
	}
	
	public void PlayerIntro(){

		System.out.println("Please enter a username:");
		
		UserInput();
		
		System.out.println("Hello " + Username + " Nice of you to play. ");
		
		StartUp.StartMenu();
	}
	
	
}
