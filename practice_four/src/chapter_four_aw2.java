/** Prathamesh Gawade 4/1/21 */
import java.util.Scanner;

public class chapter_four_aw2
{
	public static void main (String [] args)
	{
		Scanner key = new Scanner(System.in);
		int input1, input2;
		int sum;
		int choice;
		
		System.out.print("Hello! this is a program that will take your input and print the sum of it! ");
		
		do 
		{ 
			System.out.println("What's your first number?: ");
			input1 = key.nextInt();
			System.out.println("What's your second number?: ");
			input2 = key.nextInt();
			sum = input1 + input2;
			System.out.println("Your sum is: " + sum);
			System.out.println("Would you like to run this"
					+ " again?/n Please enter '0' to run it again or '1' to Terminate it");
			choice = key.nextInt();
		
		}
		while (choice == 0);
		
		System.out.println("======Terminated======");
	}
}