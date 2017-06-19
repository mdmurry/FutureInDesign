package game;

public class Player {
	private String name;
	private String FighterType;
	private int energy;
	private int currency;
	private String weapon;
	private boolean alive;
	
	public Player(String name){
		this.name = name;
		this.alive = true;
	}
	
	public String GetName(){
		return name;
	}
	
	public boolean GetStatus(){
		return this.alive;
	}
	
	public void SetStatus(boolean status){
		this.alive = status;
	}
	
}
