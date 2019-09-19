import java.util.Scanner;

/**
 * 
 * @author David
 *@description This program checks the user age and see if user can drink alcohol
 */
public class Unit4 {
	public static void main (String[] args) {
		int age;
		int name;
		String option="can't";
		Scanner in = new Scanner(System.in);
		
		System.out.println("This program will check if you are legal to drink alcohol");
		//input
		System.out.println("Enter your name:");
		name = in.nextInt();
		System.out.printf("ok %, Enter your age:",name);
		age = in.nextInt();
		
		//logic
		if(age>= 21) {
		option = "can't";
		}
		
		//output
	    System.out.printf("You %s can't drink alcohol", option);
				
			}
}
