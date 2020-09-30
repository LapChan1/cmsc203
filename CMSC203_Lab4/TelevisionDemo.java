
import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo
	{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user’s channel choice
		
		Television portable = new Television("19 inch Sharp",19);// define a Sharp 19in Tv
		System.out.println("A "+portable.getManufacturer()+" has been turned on.");
		System.out.println("What channel do you want?"); //ask user to enter channel
		station=keyboard.nextInt();
		portable.setChannel(station);// set Tv channel to new station
		portable.decreaseVolume();  //decrease volume by 2
		portable.decreaseVolume();
		//print channel and volume
		System.out.println("Channel: "+portable.getChannel()+ "\tVolume: "+portable.getVolume());
		}
	}