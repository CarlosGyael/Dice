import java.util.Scanner;

public class DiceOptionMulti {

	RandomInteger getDice = new RandomInteger();
	PointEngine getPoint = new PointEngine();
	
	
	
	boolean run = true;
	int choice = 0;
	
	Scanner keyboard =new Scanner (System.in); 
	int DiceSix = getDice.RandomSix();
	
	Time OneSec = new Time();
	int betTotal;
	int player1 =getPoint.Money + betTotal;
	int player2 = getPoint.Money2 + betTotal;
	public void DiceMulti(UserPlayer User , Multiplayer User2 ){
		
		//Multiplayer User2 = new Multiplayer();
		
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
					System.out.println("Your start with a total of $500");
					

					
					int counter = 1;

					while (getPoint.point < 50 && getPoint.User2Point < 50){
						
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
								betTotal = 25;
								getPoint.addMoney(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + " Your total is now: " + player1);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + " Your total is now: " + player2);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
					counter ++;
				}
				

					
			}	else if (choice == 2){
					System.out.println("Your start with a total of $500");
					
					int counter = 1;
					
					while (getPoint.point < 50 && getPoint.User2Point < 50){
					
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + "Your total is now: " + getPoint.Money + betTotal);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + "Your total is now: " + getPoint.Money2+betTotal);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
						counter++;
					}
					
					
				}else if (choice == 3){
					System.out.println("Your start with a total of $500");
					
					int counter = 1;
					
					while (getPoint.point < 50 && getPoint.User2Point < 50){
						
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + "Your total is now: " + getPoint.Money + betTotal);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + "Your total is now: " + getPoint.Money2+betTotal);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
						counter++;
					}
					
					
				}else if (choice == 4){
					
					System.out.println("Your start with a total of $500");
					
					int counter = 1;
					
					while (getPoint.point < 50 && getPoint.User2Point < 50){
						
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + "Your total is now: " + getPoint.Money + betTotal);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + "Your total is now: " + getPoint.Money2+betTotal);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
						counter++;
					}
				}else if (choice == 5){
					System.out.println("Your start with a total of $500");
					
					int counter = 1;
					
					while (getPoint.point < 50 && getPoint.User2Point < 50){
						
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + "Your total is now: " + getPoint.Money + betTotal);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + "Your total is now: " + getPoint.Money2+betTotal);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
						counter++;
					}
				}else if (choice == 6){
					System.out.println("Your start with a total of $500");
					
					int counter = 1;
					
					while (getPoint.point < 50 && getPoint.User2Point < 50){
						
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
								betTotal = 25;
								getPoint.addMoney2(50);
							}else if(choice ==2){
								OneSec.TwoSeconds();
								System.out.println("You bet $100");
								betTotal = 50;
								getPoint.addMoney2(100);
							}else if(choice ==3){
								OneSec.TwoSeconds();
								System.out.println("You bet $150");
								betTotal = 75;
								getPoint.addMoney2(150);
							}else if (choice ==4){
								menu menu = new menu();
								menu.StartMenu();
							}
						}
						
					int DiceFour = getDice.RandomFour();
						

					OneSec.TwoSeconds(); 
					
					System.out.println("It's " + User.Username + " turn to roll..");

					
					System.out.println("" + User.Username + " dice landed on " + DiceFour);
					 getPoint.addPoints(DiceFour);
					System.out.println("" + User.Username + " current points: " + getPoint.point );
					
					OneSec.TwoSeconds();

					System.out.println("" +User2.Username2+ " it's your turn to roll..");

					
					int DiceFourComp = getDice.RandomFour();
					
					OneSec.OneSecond();

					System.out.println("" +User2.Username2+ " dice landed on " + DiceFourComp);
					 getPoint.addUser2(DiceFourComp);
					System.out.println("" +User2.Username2+ " current points: " + getPoint.User2Point );


					System.out.println(User.Username + " current points: " + getPoint.point +" ---------------- " +User2.Username2+ " current points: " + getPoint.User2Point );
					
					if ( getPoint.point > getPoint.User2Point){
						System.out.println(User.Username + "Your total is now: " + getPoint.Money + betTotal);
					}else if(getPoint.point < getPoint.User2Point){
						System.out.println(User2.Username2 + "Your total is now: " + getPoint.Money2+betTotal);
					}
					System.out.println(User.Username+ " amount: " + getPoint.Money);
					System.out.println(User2.Username2+ " amount: " + getPoint.Money2);
						counter++;
					}
				}
				else {
					System.out.println("Sorry we don't recognize that command");
					
				}
			
			if (getPoint.User2Point > getPoint.point){
				System.out.println("I'm sorry you lost the game.");
			}else if (getPoint.point > getPoint.User2Point){
				System.out.println("Congrats on winning the game!");
			}else if (getPoint.point == getPoint.User2Point){
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
				
			
			
			run = false;
			
			menu start = new menu();
			start.StartMenu();
			} 
		
	}
	
}
