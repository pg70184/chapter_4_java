/** Prathamesh Gawade 4/1/21
*/
/** This created a code that will ask a user to input a number and
 * store the product of it in an another variable
 * if that product exceeds 100 it will terminate
 */


import java.util.Scanner;

public class chapter_four_aw1
{
	public static void main (String [] args)
	{	
		int input;    		//variable for user input
		int product;		//variable for product
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Please enter a number: "); 
		input = key.nextInt();
		product = (input * 10);
		
		while (product < 100)
		{
			System.out.println("Please enter another number: ");
			input = key.nextInt();
			product = (input * 10);
		}
	}
}