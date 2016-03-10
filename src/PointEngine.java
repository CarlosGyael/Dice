
public class PointEngine {
	public int point = 0;
	public int CompPoint = 0;
	public int User2Point = 0;
	public int Money = 500;
	public int Money2 = 500;
	
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
	public int User2Points(){
		return User2Point;
	}
	public void addUser2(int newpoints){
		User2Point+=newpoints;
	}
	public int Money(){
		return Money;
	}
	public void addMoney(int newmoney){
		Money-=newmoney;
	}
	public int Money2(){
		return Money;
	}
	public void addMoney2(int newmoney){
		Money2-=newmoney;
	}
	public void addMoney3(int newmoney){
		Money+=newmoney;
	}
	public void addMoney4(int newmoney){
		Money2+=newmoney;
	}
	
}
