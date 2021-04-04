/** Prathamesh Gawade chapter 4 exercise 3 java 4/1/21 
 * This script will run a loop 10 times asking for user input then keep a running total
 * of the numbers entered*/

import java.util.Scanner;

public class chapter_four_aw4
{
		public static void main (String [] args)
		{
			
		Scanner key = new Scanner(System.in);
		
		int input;
		int sum = 0;
		int loops = 1;
		
		System.out.println("Please give us an initial number!: ");
		
		while (loops < 10)
		{
			input = key.nextInt();
			loops++;
			System.out.println("Please give us number " + loops);
			sum =+ input;
		}
		
		System.out.println("The total is" + sum);
	}
}