import java.util.Random;

public final class RandomInteger {
	

	UserPlayer point = new UserPlayer();
	
	Random randomGenerator = new Random();
	
	public int RandomSix() {

		int randomInt = randomGenerator.nextInt(6);
		
		
	    
	    return randomInt;
	}
	
	public int RandomFour() {

		int randomInt = randomGenerator.nextInt(4);
		
	    return randomInt;
	}
	
	public int RandomTen() {

		int randomInt = randomGenerator.nextInt(6);
		
		
	    
	    return randomInt;
	}
	
	public int RandomEight(){

		int randomInt = randomGenerator.nextInt(8);
		
		
		
		return randomInt;
	}
	
	public int RandomTwelve(){

		int randomInt = randomGenerator.nextInt(12);

		return randomInt;
	}
	
	public int RandomTwenty(){

		int randomInt = randomGenerator.nextInt(20);
		
		
		return randomInt;
	}
	
}