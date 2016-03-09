
public class PointEngine {
	public int point = 0;
	public int CompPoint = 0;
	public int getPoints(){
		return point;
	}
	public void addPoints(int newpoints){
		point+=newpoints;
	}
	public int CompPoints(){
		return CompPoint;
	}
	
	public void addComp(int newpoints){
		CompPoint+=newpoints;
	}

}
