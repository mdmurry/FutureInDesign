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
		currency = 0;
	}

	public String GetName(){
		return name;
	}

	/**
	 * Adds currency to the player
	 */
	public void addCurrency(int Amount){
		currency += Amount;
	}
	
	public int getCurrency(){
		return currency;
	}

	/**
	 * removes currency from the player
	 */
	public void removeCurrency(int Amount){
		if(Amount > currency){
			System.out.println("no currency was removed! you dont have enough Funds!");
		}
		else{
			currency -= Amount;
		}
	}
	/**
	 * sets the currency to a specific value
	 */
	public void setCurrency(int Amount){
		currency = Amount;
	}

	public boolean GetStatus(){
		return this.alive;
	}

	public void SetStatus(boolean status){
		this.alive = status;
	}

}
