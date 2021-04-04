/** Prathamesh Gawade 4/1/21
*/
import java.util.Scanner;

public class programming_Challenge1
{
		public static void main (String [] args)
		{
		
		Scanner n = new Scanner(System.in);
			
		int userchoice;				//the higher choice the user wants to make
		int lower_bound = 1; 		//will just be the lower bound
		int sum = 0;
		
		System.out.println("What would you like the upper bound to be?");
		userchoice = n.nextInt();
		
		for(int x = 0; x <= userchoice; x++)
		{
			sum += x;
		}
		
		System.out.println(sum);
}
}
