import java.util.Scanner;

/**
* @author David Polanco
**/
import java.util.Scanner;
public class sumofthreenumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//--Introduce the program
		System.out.println("welcome this program\ngenerates" 
		    + " sum of two numbers");
		//2--asks the user for the inputs
		System.out.println("enter two numbers");
		//3-- wait for the user's inputs and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//4--calculate
		int result= num1*num2;
		//5-- Display result
		System.out.println("Result is "+result);
	}

}