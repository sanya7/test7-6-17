package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void testConcat() {
		testclass test = new testclass();
		String result=test.concatenate("one","two");
		assertEquals("onetwo",result);
	}

}
