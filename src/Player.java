import java.util.Scanner;
public class Player {
	
	String Username;

	Scanner keyboard = new Scanner( System.in );
	
	public String UserInput(){
	
		Username = keyboard.next();
	
		return Username;
	}
	
	
}
