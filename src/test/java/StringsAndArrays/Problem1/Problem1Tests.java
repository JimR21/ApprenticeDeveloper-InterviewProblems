package StringsAndArrays.Problem1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1Tests {

	@Test
	public void testFalse() {

		String s = "How areyou?";
		boolean b = Problem1.isStringCharsUnique(s);
		
		assertEquals(b, false);
	}
	
	@Test
	public void testTrue() {

		String s = "How areyOu?";
		boolean b = Problem1.isStringCharsUnique(s);
		
		assertEquals(b, true);
	}
	
	@Test
	public void testSpace(){
		
		String s = "How are yOu?";
		boolean b = Problem1.isStringCharsUnique(s);
		
		assertEquals(b, true);
	}
	
	@Test
	public void testEmpty() {

		String s = "";
		boolean b = Problem1.isStringCharsUnique(s);
		
		assertEquals(b, true);
	}
	
	@Test
	public void testOne() {

		String s = "H";
		boolean b = Problem1.isStringCharsUnique(s);
		
		assertEquals(b, true);
	}
}
