package lab3;
import java.util.Scanner;
public class MovieDriver {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Movie newMovie = new Movie();
		boolean retry = true;
		char charHolder ='y';
		do {
		System.out.println("Please enter the movie name:");
		newMovie.setTitle(input.nextLine());
		System.out.println("Please enter the movie rating:");
		newMovie.setRating(input.nextLine());
		System.out.println("Please enter the number of ticket sold:");
		newMovie.setSoldTickets(Integer.parseInt(input.nextLine()));
		System.out.println(newMovie.toString());
		System.out.println("Do you want to enter another movie? (y or n)");
		charHolder = input.nextLine().charAt(0);
		if (charHolder =='y')
		{retry=true;}
		else if(charHolder =='n')
			{System.out.println("Thanks for using this program, goodbye.");
			retry=false;}
		else;
		}while(retry==true);
		
	}
}
