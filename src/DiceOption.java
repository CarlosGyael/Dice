import java.util.Scanner;

public class DiceOption {
	
	RandomInteger getDice = new RandomInteger();
	PointEngine getPoint = new PointEngine();
	
	
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	int DiceSix = getDice.RandomSix();
	
	Time OneSec = new Time();
	
	public void Dice(){
		int money = getPoint.Money;
		while (run){
			OneSec.OneSecond();
		System.out.println("Please choose the dice you want to use:");
		System.out.println("1. Dice4");
		System.out.println("2. Dice6");
		System.out.println("3. Dice8");
		System.out.println("4. Dice10");
		System.out.println("5. Dice12");
		System.out.println("6. Dice20");
		
		choice = keyboard.nextInt();
		
		
		
			
			if (choice ==1){
				System.out.println("Your start with a total of $500");
				int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					
				int DiceFour = getDice.RandomFour();
					

				OneSec.TwoSeconds(); 
				
				System.out.println("It's your turn to roll..");
				
				System.out.println("Your dice landed on " + DiceFour);
				 getPoint.addPoints(DiceFour);
				System.out.println("Your current points: " + getPoint.point );
				
				OneSec.TwoSeconds();
				
				System.out.println("Computer is Now rolling..");
				
				int DiceFourComp = getDice.RandomFour();
				
				OneSec.OneSecond();
				System.out.println("It's dice landed on " + DiceFourComp);
				 getPoint.addComp(DiceFourComp);
				System.out.println("It's current points: " + getPoint.CompPoint );
				System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
				 counter++;
			}
			

				
		}	else if (choice == 2){
				System.out.println("Your start with a total of $500");
				
int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					int DiceSix = getDice.RandomSix();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's your turn to roll..");
					
					System.out.println("Your dice landed on " + DiceSix);
					 getPoint.addPoints(DiceSix);
					System.out.println("Your current points: " + getPoint.point );
					
					OneSec.TwoSeconds();
					
					System.out.println("Computer is Now rolling..");
					
					int DiceSixComp = getDice.RandomSix();
					
					OneSec.OneSecond();
					System.out.println("It's dice landed on " + DiceSixComp);
					 getPoint.addComp(DiceSixComp);
					System.out.println("It's current points: " + getPoint.CompPoint );
					System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
					counter++;
				}
				
				
			}else if (choice == 3){
				System.out.println("Your start with a total of $500");
				
int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					int DiceEight = getDice.RandomEight();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's your turn to roll..");
					
					System.out.println("Your dice landed on " + DiceEight);
					 getPoint.addPoints(DiceEight);
					System.out.println("Your current points: " + getPoint.point );
					
					OneSec.TwoSeconds();
					
					System.out.println("Computer is Now rolling..");
					
					int DiceEightComp = getDice.RandomEight();
					
					OneSec.OneSecond();
					System.out.println("It's dice landed on " + DiceEightComp);
					 getPoint.addComp(DiceEightComp);
					System.out.println("It's current points: " + getPoint.CompPoint );
					System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
					counter++;
				}
				
				
			}else if (choice == 4){
				
				System.out.println("Your start with a total of $500");
				
int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					int DiceTen = getDice.RandomTen();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's your turn to roll..");
					
					System.out.println("Your dice landed on " + DiceTen);
					 getPoint.addPoints(DiceTen);
					System.out.println("Your current points: " + getPoint.point );
					
					OneSec.TwoSeconds();
					
					System.out.println("Computer is Now rolling..");
					
					int DiceTenComp = getDice.RandomFour();
					
					OneSec.OneSecond();
					System.out.println("It's dice landed on " + DiceTenComp);
					 getPoint.addComp(DiceTenComp);
					System.out.println("It's current points: " + getPoint.CompPoint );
					System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
					counter++;
				}
			}else if (choice == 5){
				System.out.println("Your start with a total of $500");
int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					int DiceTwelve = getDice.RandomTwelve();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's your turn to roll..");
					
					System.out.println("Your dice landed on " + DiceTwelve);
					 getPoint.addPoints(DiceTwelve);
					System.out.println("Your current points: " + getPoint.point );
					
					OneSec.TwoSeconds();
					
					System.out.println("Computer is Now rolling..");
					
					int DiceTwelveComp = getDice.RandomFour();
					
					OneSec.OneSecond();
					System.out.println("It's dice landed on " + DiceTwelveComp);
					 getPoint.addComp(DiceTwelveComp);
					System.out.println("It's current points: " + getPoint.CompPoint );
					System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
					counter++;
				}
			}else if (choice == 6){
				System.out.println("Your start with a total of $500");
int counter =0;
				
				while (getPoint.point < 50 && getPoint.CompPoint < 50){
					
					
					if (counter >0){
						OneSec.OneSecond();
						System.out.println("How much would you like to put into the next roll?");
						System.out.println("1. $50");
						System.out.println("2. $100");
						System.out.println("3. $150");
						System.out.println("4. None (return to Start Menu)"); 
						
						choice = keyboard.nextInt();
						
						if (choice ==1){
							OneSec.TwoSeconds();
							System.out.println("You bet $50");
							getPoint.addMoney(50);
						}else if(choice ==2){
							OneSec.TwoSeconds();
							System.out.println("You bet $100");
							getPoint.addMoney(100);
						}else if(choice ==3){
							OneSec.TwoSeconds();
							System.out.println("You bet $150");
							getPoint.addMoney(150);
						}else if (choice ==4){
							menu menu = new menu();
							menu.StartMenu();
						}
						
					}
					
					int DiceTwenty = getDice.RandomTwenty();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's your turn to roll..");
					
					System.out.println("Your dice landed on " + DiceTwenty);
					 getPoint.addPoints(DiceTwenty);
					System.out.println("Your current points: " + getPoint.point );
					
					OneSec.TwoSeconds();
					
					System.out.println("Computer is Now rolling..");
					
					int DiceTwentyComp = getDice.RandomTwenty();
					
					OneSec.OneSecond();
					System.out.println("It's dice landed on " + DiceTwentyComp);
					 getPoint.addComp(DiceTwentyComp);
					System.out.println("It's current points: " + getPoint.CompPoint );
					System.out.println("Your current points: " + getPoint.point+"-----------------" +"Computer current points: " + getPoint.CompPoint );
					counter++;
				}
			}
			else {
				System.out.println("Sorry we don't recognize that command");
				
			}
		
		if (getPoint.CompPoint > getPoint.point){
			System.out.println("I'm sorry you lost the game.");
		}else if (getPoint.point > getPoint.CompPoint){
			System.out.println("Congrats on winning the game!");
		}else if (getPoint.point == getPoint.CompPoint){
			System.out.println("Oh snap! Its a tie!");
		}
		
		OneSec.TwoSeconds();
	
		System.out.println("Would you like to return to menu? ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		choice = keyboard.nextInt();
		
		if (choice == 1){
			break;
		}else if (choice == 2){
			System.out.println("Thank You For Playing Dice Game!");
			try {
				Thread.sleep(50000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
			
		
		
		
		} 
		run = false;
		
		menu start = new menu();
		start.StartMenu();
		}
	}
