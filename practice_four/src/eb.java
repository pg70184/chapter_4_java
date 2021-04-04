import java.util.Scanner;

public class eb
{
	public static void main (String [] args)
	{
		double input;
		double sum = 0;
		double x;
		
		System.out.print("Please give me your first number!");
		
		Scanner Keyboard = new Scanner(System.in);
		 input = Keyboard.nextDouble();
		
		 
		for (x = 1; x < 7; x++)
		{
			System.out.println("Please enter another number!: " 
					);
			input = Keyboard.nextDouble();
			sum += input;
		}
		
		System.out.println(sum);
		
	}
}