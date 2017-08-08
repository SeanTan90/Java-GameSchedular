package arrayQuestions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQn2 {

	@Test
	public void noEqualValues() {
		Solutions sol = new Solutions();
		int[] test = {1, 2, 3};
		assertEquals(0, sol.solutions(test));
	}
	
	@Test
	public void limitArraySize() {
		Solutions sol1= new Solutions();
		int[] test1 = new int[100000];
		assertEquals(-1, sol1.solutions(test1));
	}
	
	@Test
	public void rangeOfElements() {
		Solutions sol2 = new Solutions();
		int[] test2 = {1000000001};
		assertEquals(0, sol2.solutions(test2));
	}

}
