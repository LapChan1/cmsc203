/**
 * This program help resolve connection problem by providing suggestions.
 * @author LapChan
 * @version 9/15/20
 * 
 *
 */
 


import java.util.Scanner;

public class WiFiDiagnosis 
{

public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);   //initiate scanner
	boolean fixed = false, toISP=false;      //initiate boolean values 
	String solution = "";					//initiate value that hold end message
	int iteration=1;						// initiate value that will be use for switch function
	System.out.println("This program is designed to help with connection problem.\n"
			+ "First, try restart computer and reconnect.\n"   
			+ "Your problem has been fixed. (Enter true or false)\n");
								//print header when program start and ask for input
	fixed = input.nextBoolean();      	// user input whether problem has been fixed
	if(fixed ==true)     			//if yes, program ends
	{
		solution = "Restarting your computer or reconnecting"; 
		//let the solution variable hold what solve the user's problem
	}
		while(fixed==false)	
								/*if not programs continue to advice until 
								the problem is solved or until advice run out*/
			
		{   
			switch(iteration++)
			{
				case 1:				//provide next advice
					System.out.println("Next, reboot your router.\n"
						+ "Your problem has been fixed. (Enter true or false)\n");
					fixed = input.nextBoolean(); //ask user whether problem has been fixed
					if(fixed ==true)
					{
						solution = "Rebooting your router";
						//let the solution variable hold what solve the user's problem
					}
					break;
				case 2:
					System.out.println("Next ,make sure the cables to your router "
							+ "are plugged in firmly and your router is getting power.\n"
						+ "Your problem has been fixed. (Enter true or false)\n");
					fixed = input.nextBoolean();
					if(fixed ==true)
					{
						solution = "Fixing the cable or checking the power";
					}
					break;
				case 3:
					System.out.println("Next, move your computer closer to your router.\n"
						+ "Your problem has been fixed. (Enter true or false)\n");
					fixed = input.nextBoolean();
					if(fixed ==true)
					{
						solution = "Moving your computer closer to the router";
					}
					break;
				default:
					System.out.print("Your problem has not been fixed.\n");
					fixed = true; 	//end the loop 
					toISP =true;	//set to true when last advice is display
					break;
			}
		}
	if(toISP ==true)
	{
		System.out.print("Please contact your ISP for other solutions.\n");
		//if advice run out, display a differnt message than when problem is solved
	}
	else
	{
		System.out.print(solution +" has fixed your problem.\n");
		//display what action has solve the problem
	}
	System.out.print("Thank you for using this program, have a nice day\n"
			+ "Program made by Lap Chan");
		//end message
	}
}

