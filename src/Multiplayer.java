import java.util.Scanner;

public class Multiplayer {

	int choice = 0;
	String Username2;
	
	Scanner keyboard =new Scanner(System.in);
	
	public String UserInput(){
		
		Username2 = keyboard.next();
	
		return Username2;
	}
	
	public void PlayerTwo(){

		System.out.println("Please enter a username:");
		
		UserInput();
		
		System.out.println("Hello " + Username2 + " Nice of you to play. ");
	}
		
	
	public void Multiplayer(){
		
		System.out.println("Alright you will be facing another user to see who's the better dice roller. Are you ready? Press 1 for yes");

		choice = keyboard.nextInt();
		
		
		if (choice == 1){
			System.out.println("Awesome! Let's Start!");
		}
		else {
			System.out.println("Sorry we don't recognize that command.");
		}
		
	}
	
	
}
