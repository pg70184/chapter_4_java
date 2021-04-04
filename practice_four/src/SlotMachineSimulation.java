/** Prathamesh Gawade 4/2/21 Practice Lab */
import java.util.Scanner;
import java.util.Random;




public class SlotMachineSimulation
{
	public static void main (String [] args)
	{
		//Create a random object to generate random numbers
		Random gamble = new Random();
		
			int outputs;  //this is for the possible outcomes
			double bet;											//user's wager
			String word = null;
			String slot_result;
			Random random = new Random();
			int playagain;
			int guess1, guess2, guess3;
		
		Scanner Slot = new Scanner (System.in);
	
		//This is the introduce the slot player and get his first bet
		System.out.print("Welcome to the Slot Machine. Please place a bet: ");
		bet = Slot.nextDouble();
		
		//clearing Scanner
		
	
		//just initiates the loop
	System.out.println("Please type '1' if you would like to play or '2' "
			+ "\nif you do not want to play");
	playagain = Slot.nextInt();
	
	
	
	//it's while to initiate once 
	if (playagain == 1)
	{
		String r1 = null;
		String r2 = null;
		String r3 = null;
		//This just lets the user understand the bounds of the program
		System.out.println("Alright now give me your guesses from 1-5?" +
		"\n 0 = Cherries, 1 = Oranges, 2 = plums, 3 = Bells, 4 = Melons, 5 = Bars");
		
		//This will input all the user's bets
		System.out.println("Your first guess is: ");
		guess1 = Slot.nextInt();
		System.out.println("Your second guess is?: ");
		guess2 = Slot.nextInt();
		System.out.println("Your third guess is?: ");
		guess3 = Slot.nextInt();
		
		//clearing Scanner
		Slot.nextLine();
		
		
		System.out.println("Alright now press enter to pull the Lever!");
		while(Slot.nextLine() != null)
		{
			
			//prints 3 guesses
			for(int r = 0; r < 3; r++)
			{
				outputs = random.nextInt(6);
				
			//Will save all the possible outputs in the varaible word
				if (outputs == 0)
				{
					word = "Cherries";
					System.out.println(word);
				}
				else if (outputs == 1)
				{
					word = "Oranges";
					System.out.println(word);
				}
				else if (outputs == 2)
				{
					word = "Plums";
					System.out.println(word);
				}
				else if (outputs == 3)
				{
					word = "Bells";
					System.out.println(word);
				}
				else if (outputs == 4)
				{
					word = "Melons";
					System.out.println(word);
				}
				else if (outputs == 5)
				{
					word = "Bars";
					System.out.println(word);
				}
				
				//deduces the varaibles to three smaller ones
				
				if(r == 1)
				{
					 r1 = word;
				}
				else if(r == 2)
				{
					 r2 = word;
				}
				else if(r == 3)
				{
					 r3 = word;
				}
				
			 

		}
		//Will print out based on the designated output
			if(r1 == r2 && r2 == r3 && r1 ==r3)
			{
				System.out.println("Congratulations your earnings have tripled!" + bet * 3);
			}
			if(r1 != r2 && r2 != r3 && r1 != r3)
			{
				System.out.println("Sorry you don't win anything!: :(");
			}
			if(r1 == r2 && r2 != r3 && r1 == r3)
			{
				System.out.println("You have partially won, your earnings are now doubled!: " + bet * 2);
			}
			if(r1 == r3 && r2 != r3 && r3 == r1)
			{
				System.out.println("You have partially won, your earnings are now doubled!: " + bet * 2);
			}
	
	}}
		
	//just to account for invalid input
	else if (playagain == 2)
	{
		System.out.println("Understandable Have a nice Day!");
	}
	else
	{
		System.out.println("That is not a valid input");
	}
	
	
	
	
	
	
		}
	}

