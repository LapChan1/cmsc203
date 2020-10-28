/**
 * Property class
 * @author Chan
 *@version 10/28
 */
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
/**
 * default Constructors
 */
public Property() {
	this.propertyName="";
	this.city="";
	this.rentAmount=0;
	this.owner="";
	this.plot = new Plot (0,0,1,1);
}

/**
 * copy constructor for plot
 * @param p plot to be copied
 */
public Property(Plot p) {
	this.plot = new Plot(p.getX(),p.getY(),p.getWidth(),p.getDepth());
}
/**
 *  constructor with default plot
 * @param n, property name
 * @param c, property city location
 * @param r, property rent
 * @param o, property owner
 */
public Property(String n,String c, double r,String o) {// parametized constructor
	this.propertyName=n;
	this.city=c;
	this.rentAmount=r;
	this.owner=o;
	this.plot = new Plot (0,0,1,1);//default plot
}
/**
 * 
 * @param n, property name
 * @param c, property city location
 * @param r, property rent
 * @param o, property owner
  * @param x  property plot left most x value
 * @param y  property  plot's up most y value
 * @param w  property  plot's width
 * @param d  property  plot's depth
 */
public Property(String n,String c, double r,String o,int x,int y, int w, int d) {
	this.propertyName=n;
	this.city=c;
	this.rentAmount=r;
	this.owner=o;
	this.plot = new Plot(x,y,w,d);
}
	
//getters
public String getPropertyName() {
	return this.propertyName;
}
public String getCity() {
	return this.city;
}
public double getRentAmt() {
	return this.rentAmount;
}
public String getOwner() {
	return this.owner;
}
public Plot getPlot() {
	return this.plot;
}
//setters
public void setPropertyName(String n) {
 this.propertyName= n;
}
public void setCity(String c) {
	this.city = c;
}
public void setRentAmt(double r) {
	this.rentAmount=r;
}
public void setOwner(String o) {
	this.owner=o;
}
public void setPlot(int a,int b, int c, int d) {
	Plot p = new Plot(a,b,c,d);
	this.plot = p;
}

/**
 * @return the object's instances in string form
 */
	public String toString() {
		return "Property Name:"+this.propertyName +"\n Located in" +this.city+
				"\n Belonging to: "+this.owner+"\n"+
				" Rent Amount:" +this.rentAmount;
	}
}
