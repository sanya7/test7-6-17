package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void test() {
		testclass test = new testclass();
		int result=test.multiply(2,5);
		assertEquals(10,result);
	}

}
