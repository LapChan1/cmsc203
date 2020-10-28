/**
 * Plot class
 * @author Chan
 *@version 10/28
 */
public class Plot {
 private int x;  // x and y represent upper left corner of the plot
 private int y;
 private int width;//represent the horizontal extend
 private int depth;//represent the vertical extend
 
 /**
  *  default constructor
  */
 public Plot() {
	 this.x=0;
	 this.y=0;
	 this.width=1;
	 this.depth=1;
 }
 /**
  * copy constructor
  * @param p plot to be copied
  */
 public Plot(Plot p) {
	 this.x=p.getX();	
	 this.y=p.getY();
	 this.width=p.getWidth();
	 this.depth=p.getDepth();
 }
 /**
  * @param x   plot left most x value
 * @param y    plot's up most y value
 * @param w    plot's width
 * @param d    plot's depth
  */
 public Plot(int x,int y, int w, int d) {
	 this.x=x;  // parameter constructor
	 this.y=y;
	 this.width=w;
	 this.depth=d;
 }

 /**
  * check if this plot overlap with another plot
  * @param p plot to be checked with
  * @return if the two plot overlap
  */
 public boolean overlaps(Plot p) {// check if any plot overlap
	 int l1 = this.x;			// x value of left side of this plot
	int r1=this.x+this.width;//x val of right side of this plot
	 int up1=this.y;  				// y value of top side of this plot
	 int down1=this.y+this.depth;//  y val of bottom of this plot
	 int l2 = p.getX();			// x value of left side of parameter plot
	int r2=p.getX()+p.getWidth();//x val of right side of parameter plot
	int up2=p.getY();  				// y value of top side of parameter plot
	int down2=p.getY()+p.getDepth();//  y val of bottom of parameter plot
	boolean overlaps=false;
	boolean horizontalBtween=((l1>l2&&l1<r2)||(l2>l1&&l2<r1));
	boolean verticalBtw=((up1>up2&&up2>down1)||(up2>up1&&up1>down2));
	
	 if(horizontalBtween)
		 {overlaps= true;}// check if the leftmost or right most point of an rectangle is within the other rectangle
	 else if (horizontalBtween)
	 {overlaps= true;}// check if the upmost or bottom most point of an angle is within the other rectangle

	 else if(this.encompasses(p)||p.encompasses(this))
		{ 
		 overlaps= true;// if they encompass, they overlaps
		}
	 else {overlaps= false;}// if any point of a plot  is within another plot, then they overlap
	 return overlaps;
 }
 
 /**
  * 
  * @param p plot to be checked with
  * @return if the this plot encompass another plot
  */
 public boolean encompasses(Plot p) {// check if any plot is encompassed
	 int l1 = this.x;			// x value of left side of this plot
	int r1=this.x+this.width;//x val of right side of this plot
	 int up1=this.y;  				// y value of top side of this plot
	 int down1=this.y+this.depth;//  y val of bottom of this plot
	 int l2 = p.getX();			// x value of left side of parameter plot
	int r2=p.getX()+p.getWidth();//x val of right side of parameter plot
	int up2=p.getY();  				// y value of top side of parameter plot
	int down2=p.getY()+p.getDepth();//  y val of bottom of parameter plot
	boolean isHorEncompass=false;
	boolean isVerEncompass=false;
	boolean encompass=false;
	if(l1<=l2&&r2<=r1)
	{
		isHorEncompass=true;  // check if horizontal side of one of the rectangle is encompassed
	}
	if(up1<=up2&&down1>=down2)
	{
		isVerEncompass=true;// check if vertical side of one of the rectangle is encompassed
	}
	if(isVerEncompass&&isHorEncompass)
	{
		encompass= true;// if both vertical and horizontal side of a rectangle is encompassed. then the rectangle is encompassed
	}
	else {encompass= false;}
return encompass;
 }
 
//getters
 public int getX() {
		return this.x;
}
 public int getY() {
		return this.y;
}
 public int getWidth() {
		return this.width;
}
 public int getDepth() {
		return this.depth;
}
//setters
 public void setX(int a) {
	this.x= a;
}
public void setY(int b) {
	this.y= b;
}
public void setWidth(int c) {
	this.width=c;
}
public void setDepth(int d) {
	this.depth=d;
}

public String toString() {
	return "Upper left: ("+this.x +"," +this.y+"); Width: " +this.width+" Depth: "+this.depth;
}
}
