package game;

import java.util.Random;
import java.util.Scanner;

public class Dale {
	
	Player player;
	Scanner scanner;
	
	public int GetRandom(int range){
		Random random = new Random();
		return(random.nextInt(2));
	}
	
	public int GetResponse(){
		int response;
			response = scanner.nextInt();
		return(response);
	}
	
	public void Next(Player player, Scanner scanner){
		this.player = player;
		this.scanner = scanner;
		System.out.println("... and there " + player.GetName() + " was, about to");
		System.out.println(" enter a desolate Western town filled with angry robots.");
		
		System.out.println("What would you like to do?");
		System.out.println("1) Go into town and take your chances.");
		System.out.println("2) Run away, Run away!!");
		System.out.println("3) Turn around and walk away slowly.");

		switch(GetResponse()){
		case 1:
			System.out.println("Okay, it's your funeral.");
			InTown();
			break;
			
		case 2:
			System.out.println("Running...");
			int outcome = GetRandom(2);
			if(outcome == 0){
				System.out.println("Oops, in your excitement to get away you fell off a cliff.");
			}
			else {
				System.out.println("Oops, in your excitement to get away you ran through an indian burial");
				System.out.println("ground which angered the local native americans who beat you to death");
				System.out.println("with buffalo poo.");
			}
			player.SetStatus(false);
			return;
			
		case 3:
			System.out.println("Walking slowly...\nYou got away from the angry robots!");
			return;
		}
		
		
		
	}
	
	public void InSaloon(){
		
	}
	
	public void InStore(){
		
	}
	
	public void InSheriffOffice(){
		
	}
	public void InTown(){
		int choice;
		do{
			System.out.println("Okay you're in town. Would you like to:");
			System.out.println("1) Check out the saloon");
			System.out.println("2) Visit the general store");
			System.out.println("3) Visit the sheriff's office");
			choice = GetResponse();
			switch(choice){
			case 1:
				InSaloon();
				break;
			case 2:
				InStore();
				break;
			case 3:
				InSheriffOffice();
				break;
			default:
				System.out.println("** Invalid choice **");
				break;
			}
		}while(choice < 1 || choice > 3);
	}
}
