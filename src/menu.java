import java.util.Scanner;
public class menu {

	Time twoSecDelay = new Time();

	static UserPlayer Intro = new UserPlayer();
	
	SinglePlayer newSinglePlayer = new SinglePlayer();
	
	Multiplayer newMultiplayer = new Multiplayer();
	
	DiceOption diceChoice = new DiceOption();
	
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	public void menu() {
		
		System.out.println("Welcome to Dice Game!");

		twoSecDelay.TwoSeconds();

		System.out.println("Here are the rules: Player one goes first rolling the die. Then the computer or player 2 goes next rolling the die. Depending on the number in which you land on determines how far you move. For example, if you roll a 4, then you move forward 4 spaces. Also, depending on the size of the die that you choose will determine the maxium amount of spaces one can move. The size of the die available are: d4, d6, d8, d10, d12, d20. To win the game, the first player to 100 or more wins. ");
	
		while(run){
		System.out.println("Did you finish reading the rules?");
		System.out.println("\nPress 1 for Yes");
		
		
		choice = keyboard.nextInt();
	
		if (choice == 1){
			Intro.PlayerIntro();
			break;
		}
		else {
			System.out.println("Sorry we don't recognize that answer!");
		}
		}
		
	}
	
	public void StartMenu(){
		
		
		while (run){
		System.out.println("Menu");
		System.out.println("----");
		
		System.out.println("1. Single Player");
		System.out.println("2. Multiplayer");
		System.out.println("3. Exit");
		
		choice = keyboard.nextInt();
		
		if (choice ==1){
			
			newSinglePlayer.singlePlayer();
			break;
		}else if(choice ==2){
			newMultiplayer.Multiplayer();
			
			//new dice class
			
		}else if (choice == 3){
			System.out.println("Thank You For Playing Dice Game!");
			try {
				Thread.sleep(50000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
		}else {
			System.out.println("Sorry we don't recognize that answer!");
			
		}
		}
		
		diceChoice.Dice();
	}
	

	
}
