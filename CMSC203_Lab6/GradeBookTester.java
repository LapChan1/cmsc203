import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	private GradeBook bookOne,bookTwo,bookThree;
	@BeforeEach
	void setUp() throws Exception {
		bookOne=new GradeBook(5);
		bookTwo=new GradeBook(5);
		bookThree= new GradeBook(5);
		bookOne.addScore(56.5);
		bookOne.addScore(77);
		bookTwo.addScore(97);
		bookTwo.addScore(88.9);
		bookTwo.addScore(90);
		bookTwo.addScore(78);
	}

	@AfterEach
	void tearDown() throws Exception {
		bookOne=null;
		bookTwo=null;
		bookThree=null;
	}

	@Test
	void testAddScore() {
		assertTrue(bookOne.toString().equals("56.5 77.0 "));
		assertEquals(bookOne.getScoreSize(),2);
		assertTrue(bookTwo.toString().equals("97.0 88.9 90.0 78.0 "));
		assertEquals(bookTwo.getScoreSize(),4);
		
	}

	@Test
	void testSum() {
		assertEquals(133.5, bookOne.sum(), .0001);
		assertEquals(353.9, bookTwo.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(56.5, bookOne.minimum(), .001);
		assertEquals(78.0, bookTwo.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		assertTrue(bookOne.finalScore()==77.0);
		assertTrue(bookTwo.finalScore()==275.9);
		assertTrue(bookThree.finalScore()==0);
	}

	

}
