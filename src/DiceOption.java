import java.util.Scanner;

public class DiceOption {
	
	RandomInteger getDice = new RandomInteger();
	
	
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	
	public void Dice(){
		
		while (run){
		System.out.println("Please choose the dice you want to use:");
		System.out.println("1. Dice4");
		System.out.println("2. Dice6");
		System.out.println("3. Dice8");
		System.out.println("4. Dice10");
		System.out.println("5. Dice12");
		System.out.println("6. Dice20");
		
		choice = keyboard.nextInt();
		
		
		
			
			if (choice ==1){
				System.out.println("Good choice. Let the games begin!");
				break;
				//int DiceRoll = Dice.RandomFour();
				//System.out.println("Your dice landed on " + DiceRoll);
				
			}else if (choice == 2){
				System.out.println("Good choice. Let the games begin!");
				break;
				//int DiceRoll = Dice.RandomSix();
				//System.out.println("Your dice landed on " + DiceRoll);
			}else if (choice == 3){
				System.out.println("Good choice. Let the games begin!");
				break;
			}else if (choice == 4){
				System.out.println("Good choice. Let the games begin!");
				break;
			}else if (choice == 5){
				System.out.println("Good choice. Let the games begin!");
				break;
			}else if (choice == 6){
				System.out.println("Good choice. Let the games begin!");
				break;
			}
			else {
				System.out.println("Sorry we don't recognize that comand");
				
			}
		
		
		}
		System.out.println("You roll the first Dice!");
		}
	}
