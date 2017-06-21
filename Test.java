package game;

//import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// test case to determine why Scanner is throwing exception
		// create first instance of scanner
		Scanner scanner1 = new Scanner(System.in);
		// read value from System.in
		System.out.println("Enter first value:");
		String s1 = scanner1.nextLine();
		// close scanner
		scanner1.close();
		// create second instance of scanner
		/*
		try {
			System.out.println(System.in.available());
		} catch (IOException e){
			System.out.println("IOException: " + e.getMessage());
			return;
		}
		*/
		// create second instance of scanner
		Scanner scanner2 = new Scanner(System.in);
		// read value from System.in
		System.out.println("Enter second value:");
		String s2 = scanner2.nextLine();
		// close scanner
		scanner2.close();

	}

}
