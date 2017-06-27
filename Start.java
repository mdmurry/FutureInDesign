package game;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		String name = "";
		Player player;
		
		System.out.println("hey! are you ready? (y/n)");
		
		Scanner input = new Scanner(System.in);
		String response = input.next();
		//System.out.println(response);
		if(response.equals("y")){
			System.out.println("a long, long, looonnnnng time ago there was a wanderer by the name of... \n ...what's your name?");
			name = input.next();
			player = new Player(name);
			System.out.println("Great! Nice to meet you " + player.GetName() +"!");
			System.out.println("Let's continue! A long, long, loooooooooooong time ago, in midevil space, there was a wanderer named " + player.GetName() + " and he got very lost... Where are you?");
			System.out.println("1) I am in space, duh!");
			System.out.println("2) I am in my bunker!");
			System.out.println("3) I am in a crocodile infested moat!");
			System.out.println("4) I am on the search for purpose, like all wanderers");
			System.out.println("5) I dont know, I see a house in the distance!");
			System.out.println("6) I am on a ship, traveling through space!");
			System.out.println("7) I'm somewhere in the desert near a small town.");
			switch(input.nextInt()){
			case 1: 
				System.out.println("Choice #1");
				break;
				
			case 2: 
				System.out.println("Choice #2");
				break;
			
			case 3: 
				System.out.println("Choice #3");
				break;
			
			case 4: 
				System.out.println("Choice #4");
				break;
			
			case 5: 
				System.out.println("Choice #5");
				break;
				
			case 6: 
				Alex alex = new Alex();
				alex.Next(player, input);
				break;
				
			case 7:
				Dale dale = new Dale();
				dale.Next(player, input);
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
			}
			if(player.GetStatus() == true){
				System.out.println("Game Over. Your quest ended in success");
			}
			else {
			System.out.println("Game Over. You died.\nBetter luck next time.");
			}
			
		}
		else{
			System.out.println("end");
		}
		

	}

}
