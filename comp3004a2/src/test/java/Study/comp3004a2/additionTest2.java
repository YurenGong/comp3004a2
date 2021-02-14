package Study.comp3004a2;

import junit.framework.TestCase;

public class additionTest2 extends TestCase{
	public void testAddition() {
		int x = 1;
		int y = 2;
		additionClass addClass = new additionClass();
		assertEquals(2, addClass.addOne(1));
	}
	public void testTwoNumberAddition() {
		int x = 1;
		int y = 2;
		additionClass addClass = new additionClass();
		assertEquals(3, addClass.addTwoNumber(x, y));
	}
}
