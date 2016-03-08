
public class menu {

	Time twoSecDelay = new Time();

	public void menu() {

		System.out.println("Welcome to Dice Game!");

		twoSecDelay.TwoSeconds();

		System.out.println("Here are the rules: Player one goes first rolling the die. Then the computer or player 2 goes next rolling the die. Depending on the number in which you land on determines how far you move. For example, if you roll a 4, then you move forward 4 spaces. Also, depending on the size of the die that you choose will determine the maxium amount of spaces one can move. The size of the die available are: d4, d6, d8, d10, d12, d20. To win the game, the first player to 100 or more wins. ");
	}

}
