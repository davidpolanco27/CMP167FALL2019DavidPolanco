import java.util.Scanner;

/**
* @author David Polanco
**/
public class SubtractFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//--Introduce the program
		System.out.println("welcome this program\ngenerates" + " product of five numbers");
		//2--asks the user for the inputs
		System.out.println("enter five numbers");
		//3-- wait for the user's inputs and store
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		//4--calculate
		int result= num1-num2-num3-num4-num5;
		//5-- Display result
		System.out.println("Result is "+result);
	}
}