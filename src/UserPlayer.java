import java.util.Scanner;

public class UserPlayer extends Player{
	
	String Username;

	Scanner keyboard = new Scanner( System.in );
	
	public String UserInput(){
	
		Username = keyboard.next();
	
		return Username;
	}
}
