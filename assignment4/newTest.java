
public class newTest {
	
	
	public static void main(String args[]) {
		Plot plot1, plot2, plot3, plot4, plot5, plot6, plot7, plot8, plot9, 
		plot10, plot11, plot12, plot13;
		plot1 = new Plot(12,12,6,6); 
		plot2 = new Plot(10,10,2,2);
		plot3 = new Plot(11,11,3,2);
		plot4 = new Plot(16,11,4,2);
		plot5 = new Plot(13,14,4,3);
		plot6 = new Plot(16,15,3,1);
		plot7 = new Plot(11,16,3,3);
		plot8 = new Plot(16,17,4,2);
		plot9 = new Plot(11,14,2,1);
		plot10 = new Plot(19,12,2,2);
		plot11 = new Plot(12,12,3,2);
		plot12 = new Plot(15,17,3,1);
		plot13 = new Plot(15,17,3,1);
		
	System.out.println(plot5.overlaps(plot8));
	
	
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	p1 = new Property ("Almost Aspen", "Glendale", 4844.00, "Sammy Smith",2,1,2,2);
	p2 = new Property ("Ambiance", "Lakewood", 4114, "Tammy Taylor",4,1,2,2);
	p3 = new Property ("Bear Creek Lodge", "Peninsula", 4905, "Bubba Burley",6,1,2,2);
	
	m= new ManagementCompany("Railey", "555555555",6);
 
	m.addProperty(p1);
	m.addProperty(p2);
	m.addProperty(p3);
	p4 = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
	p5 = new Property ("Mystic Cove", "Lakepointe", 5327, "Joey BagODonuts",4,5,2,2);
	p6 = new Property ("Too Many Properties", "Lakepointe", 1000, "Joey BagODonuts",6,5,2,2);
	
	double sum = m.totalRent();
	System.out.println(m.addProperty(p4));
}
}
