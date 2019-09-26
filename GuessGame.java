/**
 * 
 * @author David	
 * @description A guessing game
 * @created 9/26/19
 */
import java.util.Scanner;
import java.util.Random;
public class GuessGame {
	
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	
	public static void main(String[] args) // main method
	{
		
		//Introduction the problem
		System.out.println("Welcome to Guessing 3000");
		System.out.println("Would you like to play?");
		String answer = in.next();
		
		while(answer.equalsIgnoreCase("yes")) {
		System.out.println("Enter a number from 1-10:");
		int userNumer = in.nextInt();
		int pcNumber  = rand.nextInt(10) + 1;
		if (pcNumber == pcNumber) {
			System.out.println("you won!");
			
		}else {
		System.out.println("you lost!");
		System.out.println("The pc chose" +pcNumber);
		
}
		System.out.println("ok dear, come back soon!");
		}
	}
	
}