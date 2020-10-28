

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1,p2,p3,p4,p5,p6;
	ManagementCompany m;
	@Before
	public void setUp() throws Exception {
		//student create a management company
		p1 = new Property ("Wess", "Germantown", 2200, "Lap",2,1,1,1);
		p2 = new Property ("Ness", "Germantown", 1500, "Chan",3,2,2,2);
		p3 =new Property ("Yonder", "Rockville", 5000, "John",6,3,1,1);
		
		m= new ManagementCompany("Carson", "12345",5);
		//student add three properties, with plots, to mgmt co
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		p4=new Property ("New Yonder", "Rockville", 7000, "John",0,7,1,1);
		p5=new Property ("New Yonder", "Rockville", 7000, "John",1,3,1,1);
		p6=new Property("Exceed","nowhere",1200,"nobody",6,0,1,1);
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);
		m.addProperty(p4);
		m.addProperty(p5);
		m.addProperty(p6);
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxRentProp() {
		assertEquals(m.getMAX_PROPERTY(),5);
		//student should test if maxRentProp contains the maximum rent of properties
		
	}

	@Test
	public void testTotalRent() {
		System.out.println(m.totalRent());
		assertEquals(m.totalRent(),22700.0,0);
		//student should test if totalRent returns the total rent of properties
	}

 }
