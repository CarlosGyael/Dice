import java.util.Scanner;

public class Multiplayer {

	int choice = 0;
	
	Scanner keyboard =new Scanner(System.in);
	
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