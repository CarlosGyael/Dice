import java.util.Scanner;
public class menu {

	Time twoSecDelay = new Time();

	UserPlayer Intro = new UserPlayer();
	
	SinglePlayer newSinglePlayer = new SinglePlayer();
	
	Multiplayer newMultiplayer = new Multiplayer();
	
	DiceOption diceChoice = new DiceOption();
	
	DiceOptionMulti DiceChoiceMulti = new DiceOptionMulti();
	Time OneSec = new Time();
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	public void getMenu() {
		
		System.out.println("Welcome to Dice Game!");

		twoSecDelay.TwoSeconds();

		System.out.println("\nRules: Player1 goes first rolling the die. Then the computer/player2 goes next on rolling the die. "
				+ "The first person to get to 50 points wins!");
	
		while(run){
		System.out.println("Did you finish reading the rules?");
		OneSec.OneSecond();
		System.out.println("\nPress 1 for Yes");
		
		
		choice = keyboard.nextInt();
	
		if (choice == 1){
			Intro.PlayerIntro();
			StartMenu();
			break;
		}
		else {
			System.out.println("Sorry we don't recognize that answer!");
		}
		}
		
	}
	
	public void StartMenu(){
		
		
		while (run){
			OneSec.OneSecond();
		System.out.println("Menu");
		System.out.println("----");
		OneSec.OneSecond();
		System.out.println("1. Single Player");
		System.out.println("2. Multiplayer");
		System.out.println("3. Exit");
		
		choice = keyboard.nextInt();
		
		if (choice ==1){
			
			newSinglePlayer.singlePlayer();
			break;
		}else if(choice ==2){
			newMultiplayer.Multiplayer();
			
			DiceChoiceMulti.DiceMulti(Intro, newMultiplayer);
			
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
