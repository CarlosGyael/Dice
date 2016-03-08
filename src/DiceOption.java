import java.util.Scanner;

public class DiceOption {
	
	RandomInteger Dice = new RandomInteger();
	UserPlayer points = new UserPlayer();
	
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	
	public void Dice(){
		
		while (run)
		System.out.println("Please choose the dice you want to use:");
		System.out.println("1. Dice4");
		System.out.println("2. Dice6");
		System.out.println("3. Dice8");
		System.out.println("4. Dice10");
		System.out.println("5. Dice12");
		System.out.println("6. Dice20");
		
		choice = keyboard.nextInt();
		
		System.out.println("Okay you roll the first Dice!");
		
			
			if (choice ==1){
				int DiceRoll = Dice.RandomFour();
				System.out.println("Your dice landed on " + DiceRoll);
				
			}else if (choice == 2){
				int DiceRoll = Dice.RandomSix();
				System.out.println("Your dice landed on " + DiceRoll);
			}
		
		
		
		}
	}
