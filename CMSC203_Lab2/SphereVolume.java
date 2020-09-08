import java.util.Scanner;
public class SphereVolume 
{ 
	public static void main(String[] args) 
	{ 
		Scanner input= new Scanner(System.in);
		double diam=0, rad=0, vol=0; //declare diameter, radius, and volume variables
		System.out.print("This program will calculate the volume of a sphere given a diameter.\n");// Print the purpose of the program 
		System.out.println("Pleases enter a diameter: ");//Print a prompt asking for the diameter of a sphere 
		diam = input.nextDouble();//Read the diameter 
		rad = diam/2;//Calculate the radius as diameter divided by 2
		vol = ((4*Math.PI*Math.pow(rad,3))/3);//Calculate volume of the sphere using the formula (V=(4/3)(pi)(r^3))
		System.out.println("The sphere with "+diam+"m diameter will have "+ rad+"m radius and a volume of " + vol+" m^3."); //display result
	} 
} 
