package letterGrade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class homework4test2 {
	public LetterGrade myLGrade;
	public int dInput;
	public char dResult;	
	@BeforeEach
	void init() {
		myLGrade=new LetterGrade();
	}
	@Test
	public void testXF() {
		dInput=-1;
		dResult='X';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=0;
		dResult='F';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@Test
	public void testFD() {
		dInput=59;
		dResult='F';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=60;
		dResult='D';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@Test
	public void testDC() {
		dInput=69;
		dResult='D';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=70;
		dResult='C';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@Test
	public void testCB() {
		dInput=79;
		dResult='C';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=80;
		dResult='B';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@Test
	public void testBA() {
		dInput=89;
		dResult='B';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=90;
		dResult='A';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@Test
	public void testAX() {
		dInput=100;
		dResult='A';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
		dInput=101;
		dResult='X';
		assertEquals(dResult,LetterGrade.letterGrade(dInput));
	}
	@AfterEach
	public void tarDown() {
		myLGrade=null;
	}

}
