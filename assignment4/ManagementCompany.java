/**
 * ManagementCompany class
 * @author Chan
 *@version 10/28
 */
public class ManagementCompany {
private final int MAX_PROPERTY=5;
private double mgmFeePer;
private String name;
private Property[] properties;
private String taxID;
private final int MGMT_WIDTH=10;
private final int MGMT_DEPTH=10;
private Plot plot;
private int counter=0;

/**
 * default constructor
 */
public ManagementCompany() {
	name="";
	taxID="";
	properties= new Property[MAX_PROPERTY];
	plot=new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
}
/**
 * 
 * @param n   name of company
 * @param tID	company taxID
 * @param mgmFee	company management fee
 */
public ManagementCompany(String n,String tID,double mgmFee) {
	name=n;
	taxID=tID;
	mgmFeePer=mgmFee;
	properties= new Property[MAX_PROPERTY];
	plot=new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
}
/**
 * 
 * @param n   name of company
 * @param tID	company taxID
 * @param mgmFee	company management fee
 * @param x	  company plot, left most x value
 * @param y   company plot's up most y value
 * @param w   company plot's width
 * @param d   company plot's depth
 */
public ManagementCompany(String n,String tID,double mgmFee,int x,int y,int w,int d) {
	name=n;
	taxID=tID;
	mgmFeePer=mgmFee;
	properties= new Property[MAX_PROPERTY];
	plot=new Plot(x,y,w,d);
}
/**
 * copy constructor
 * @param MC ManagementCompany object that will be copied
 */
public ManagementCompany(ManagementCompany MC) {//copy const
	ManagementCompany newMC= new ManagementCompany();
	newMC = MC;
}

/**
 * add a property to property array
 * @param prop  property to be added to the property array
 * @return  return property index in property array or, negative value for certain exception
 */
public int addProperty(Property prop) {
	if(counter>MAX_PROPERTY-1)
	{
		return -1; // return -1 when property array size is >5
	}
	
	properties[counter]= new Property(prop.getPropertyName(),prop.getCity(),prop.getRentAmt(),
			prop.getOwner(),prop.getPlot().getX(),prop.getPlot().getY(),prop.getPlot().getWidth(),prop.getPlot().getDepth());
	properties[counter] = prop;
	if(properties[counter]==null)
	{
		return -2; //return -2 when property object is null
	}
	else if(properties[counter]==null)
	{
		return -2; //return -2 when property object is null
	}
	else if(!this.plot.encompasses(properties[counter].getPlot()))
	{
		return -3;// return-3 if management company does not encompass plot in new property
	}
	if(counter>0) {
	for(int i=0;i<counter;i++) {
		if(properties[counter].getPlot().encompasses(properties[i].getPlot()))
	{
		return -4;// return-4 if this property encompass any property in array
	}}}
	return counter++;// return index where the newly added property is held
}
/**
 * add a property to property array
 * @param n, property name
 * @param c, property city location
 * @param rent, property rent
 * @param o, property owner
 * @return return property index in property array or, negative value for certain exception
 */
public int addProperty(String n, String c,double rent, String o) {
	if(counter>MAX_PROPERTY-1)
	{
		return -1; // return -1 when property array size is >5
	}
	 
	properties[counter]= new Property(n,c,rent,o);
	if(properties[counter]==null)
	{
		return -2; //return -2 when property object is null
	}
	else if(!this.plot.encompasses(properties[counter].getPlot()))
	{
		return -3;// return-3 if management company does not encompass plot in new property
	}
	for(int i=0;i<counter;i++) {
		if(properties[counter].getPlot().encompasses(properties[i].getPlot()))
	{
		return -4;// return-4 if this property encompass any property in array
	}}
	return counter++;// return index for where new prop is held
}
/**
 * add a property to property array
 * @param n, property name
 * @param c, property city location
 * @param rent, property rent
 * @param o, property owner
  * @param x  property plot left most x value
 * @param y   property plot's up most y value
 * @param w   property plot's width
 * @param d   property plot's depth
 * @return  return property index in property array or, negative value for certain exception
 */
public int addProperty(String n, String c,double rent, String o,int x,int y, int w, int d) {
	if(counter>MAX_PROPERTY-1)
	{
		return -1; // return -1 when property array size is >5
	}
	 
	properties[counter]= new Property(n,c,rent,o,x,y,w,d);
	if(properties[counter]==null)
	{
		return -2; //return -2 when property object is null
	}
	else if(!this.plot.encompasses(properties[counter].getPlot()))
	{
		return -3;// return-3 if management company does not encompass plot in new property
	}
	for(int i=0;i<counter;i++) {
		if(properties[counter].getPlot().encompasses(properties[i].getPlot()))
	{
		return -4;// return-4 if this property encompass any property in array
	}
	}
	
	return counter++;// return index for where new prop is held
}

/**
 * display property in the array at given index
 * @param i index value
 * @return property at index i in the property array
 */
public String displayPropertyAtIndex(int i) {
	return properties[i].toString();
}

/**
 * 
 * @return Maximum amount of property
 */
public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}
/**
 * 
 * @return this management company's plot
 */
public Plot getPlot() {
	return this.plot;
}

/**
 * 
 * @return this management company name
 */
public String getName() {
	return this.name;
}

/**
 * 
 * @return the highest rent amount in the property array
 */
public double maxRentProp() {
	double maxRent=0;
	for(int i=0; i<counter;i++) {
		if( properties[i].getRentAmt()>maxRent) {
			maxRent=properties[i].getRentAmt();// if new property rent is bigger than current max rent, set max rent to new property rent
		}
	}
	return maxRent;
}

/**
 * 
 * @return the index of the property with highest rent
 */
public int maxRentPropertyIndex() {
	int index=0;
	for(int i=0; i<counter;i++) {
		if (properties[i].getRentAmt()==maxRentProp()) {
			index= i;// if property at index have rent = max rent, then return property index
		}
	}
	return index;
}

/**
 * 
 * @return total rent amount in property array
 */
public double totalRent() {
	double rentSum=0;
	for(int i=0; i<counter;i++)
	{rentSum+=properties[i].getRentAmt();
	}
	return rentSum;
}
public String toString() {
	String hold="";
	for(int i=0; i<counter;i++)
	{hold +="\n";
	hold+=properties[i].toString();
	}
	return hold;
}
}
