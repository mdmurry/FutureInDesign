package game;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Alex {
	
	public static void main(int[] args){
		Player player = new Player("Alex");
		Scanner scanner = new Scanner(System.in);
		Alex alex = new Alex();
		alex.Next(player,scanner);
	}
	
	Random rand = new Random();
	Player player;
	Scanner scanner;
	public void Next(Player player, Scanner scanner){
		this.player = player;
		this.scanner = scanner;

		System.out.println("ahh yes, " + player.GetName() + " was traveling through space, However I think \n the story is best told through there eyes");
		promptEnterKey();

		System.out.println("\"Captain!\" - you hear as sirens flash all around you!");
		wait(3);
		System.out.println("\"The ship needs to prepare for landing!\"");
		wait(3);
		System.out.println();
		promptEnterKey();
		System.out.println("1) No we must reach our destination! (Worse Odds)" );
		wait(1);
		System.out.println("2) Okay, Where can we land? (Better Odds)");
		switch(scanner.nextInt()){
		case 1: 
			attemptToReach();
			break;

		case 2: 
			attemptToLand();
			break;
		default:
			System.out.println("This answer did not make sense to your crew, and they take too long to decide what to do.");
			wait(5);
			System.out.println("The ship explodes");
			wait(2);
			player.SetStatus(false);
			return;
		}
	}
	public void attemptToReach(){
		System.out.println("The team attempts to begain rebuilding the shields and the engine block");
		if(rand.nextInt(2)==0){
			System.out.println("The team failed.\n your ship exploded");
			wait(2);
			player.SetStatus(false);
			return;
		}
		else{
			System.out.println("the team was successfull!");
		}
		
		
		
	}

	public void attemptToLand(){
		System.out.println("The team attempts to land the ship,");
		wait(1);
		System.out.println("you begain to move towards a planet with bone dry greens and brown waters.");
		if(rand.nextInt(5)==0){
			wait(1);
			System.out.println("As you enter the atmosphere, the ships starts to burn up ");
			wait(1);
			
			System.out.println("your ship explodes");
			wait(2);
			player.SetStatus(false);
			return;
		}
		else if(rand.nextInt(10)==0){
			wait(1);
			System.out.println("you begain making your decent and see a landing space in the open desert. ");
			wait(3);
			System.out.println("However, Just before you land, a giant monster hits you out of the sky");
			wait(1);
			System.out.println("your ship explodes");
			wait(2);
			player.SetStatus(false);
			return;
		}
		else{
			wait(1);
			System.out.println("As you make your decent you see a patch of green and try to land there.");
			wait(5);
			System.out.println("You land in a field surronded by trees.");
			wait(2);
			promptEnterKey();
			wanderByShip();
		}
	}
	
	public void wanderByShip(){
		System.out.println("would you like to find help and leave the woods, or stay by the ship and wait for help to come to you?");
		wait(3);
		System.out.println("1) Leave the Woods!");
		wait(1);
		System.out.println("2) Wait for help!");
		switch(scanner.nextInt()){
		case 1: 
			System.out.println("You Wander and find Help!");
			findHelp();
			break;
		default:
			int waitTime = rand.nextInt(30);
			System.out.println("you decide to wait for "+ waitTime + " seconds.");
			for(int i = 0; i < waitTime; i++){
				wait(1);
				System.out.println("you have waited " + (i+1) + " seconds of the " + waitTime + " Seconds you decided to wait!");
			}
			System.out.println("");
			wanderByShip();
			
		}
	}
	
	public void findHelp(){
		System.out.println("as you wander into the woods you start to get woried, The sun is beggining to set!");
		wait(2);
		System.out.println("However, you notice village in the distance.");
		System.out.println("Do you go visit it? (y/n)\n");
		if(scanner.next().equals("y")){
			if(rand.nextBoolean()){
				System.out.println("The town is empty, but you scavage through it...");
				wait(5);
				System.out.println("you find all the parts you need to fix the ship and a little bit of currency!");
				player.addCurrency(rand.nextInt(5)+1);
			}
			
			else{
			System.out.println("It looks like it is full of robots, but you continue anyway\n");
			Dale dale = new Dale();
			promptEnterKey();
			dale.Next(player, scanner);
			}
		}
		else{
			System.out.println("you decide not to visit!");
			if(rand.nextInt(3)==0){
				System.out.println("you turn around but get lost! You slowly get hungrier");
				wait(5);
				System.out.println("and hungrier");
				wait(7);
				System.out.println("and hungrier");
				player.SetStatus(false);
			}
			else{
				System.out.println("you make it back to your ship!");
				wanderByShip();
			}
		}
		
	}

	public void wait(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void promptEnterKey(){
		System.out.println("Press \"ENTER\" to continue...");
		try {
			int read = System.in.read(new byte[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
