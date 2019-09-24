/**
 * 
 * @author David
 *
 */
import java.util.Scanner;
public class superMarket {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String answer;
		double bugget;
		
		System.out.println("Welcome to Yani's SuperMarket");
		System.out.println("Would you like to see the inventory?");
		answer = in.next();
		if (answer.equalsIgnoreCase("Yes")) {		
		   System.out.printf("1.%s %n 2.%s %n "
		   		+ "3.%s %n", "Pringles", "Prosecco", "White Wine","Mozzarella Sticks");
		   System.out.println("Would you like to buy something? 1 2 3 0 ");
		   int choice = in.nextInt();
		  Switch(choice) {
		  
			  case 1 :
				  System.out.println("You selected Pringles");
				  System.out.println ("That's $2.99");
				  break;
			  case 2:
				  System.out.println ("You selected Prosecco");
				  System.out.println ("That's $99.99");
				  break;
			  case 3:
				  System.out.println ("Mozzarella Sticks");
				  System.out.println ("That's $9.99");
				  break;
				  default:
					  System.out.println("OK, come back soon")
		  }
		   
		} else {
			System.out.println("OK, come back soon");
			
		}
		
	}
}