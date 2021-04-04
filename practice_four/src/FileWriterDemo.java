/** Prathamesh Gawade File practice 4/2/21 */
import java.util.Scanner;		//Needed to get the Scanner class
import java.io.*;			//Needed to save information on user computers


public class FileWriterDemo		
{
	public static void main (String [] args) throws IOException
	{
		String filename;		//the name of the file with .txt
		String friendName;		//the name of your friend
		int numFriends;			//the number of friends in total
		
		//Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the number of friends
		System.out.print("How many friends do you have?: ");
		numFriends = keyboard.nextInt();
		
		
		//just to consume the next input
		keyboard.nextLine();
		
		//Gets the files name
		System.out.print("What's the files name?: ");
		filename = keyboard.nextLine();
		
		//Opens the file
		PrintWriter outputFile = new PrintWriter(filename);
		
		//Loop to iterate by how many total friends there are
		for (int n = 1; n <= numFriends; n++)
		{
			//Gets friends name
			System.out.print("Please give the name of friend number "
			+  n + ": ");
			friendName = keyboard.nextLine();
			
			//Gets the name of the file
			outputFile.println(friendName);
		}
		
		//closes the file
		outputFile.close();
		System.out.println("Your data has been noted! /n Goodbye!");
		
	}
}