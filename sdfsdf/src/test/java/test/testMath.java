package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.MathOperation;

public class testMath {

	@Test
	public void testAdd() {
		MathOperation mo = new MathOperation();
		int actual = mo.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	public void testSub() {
		MathOperation mo = new MathOperation();
		int actual = mo.sub(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	public void testMult(){
		MathOperation mo = new MathOperation();
		int actual = mo.mul(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
}
