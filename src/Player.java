
public class Player {
	
	Time OneSec = new Time(); 
	ComputerAnderson Anderson = new ComputerAnderson();
	ComputerCarlos Carlos = new ComputerCarlos();
	UserPlayer Username = new UserPlayer();
	
	int choice = 0;
	
	
	
	public void StartedGame(){
		
		OneSec.OneSecond();
		
			if (choice ==1){
			System.out.println(Username.Username + " VS " + Anderson.Anderson());
		}else if (choice ==2){
			System.out.println(Username.Username + " VS " + Carlos.Carlos());
		}
			
			
	}

}