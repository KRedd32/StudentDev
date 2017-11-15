package MyTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void Concattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.ConCat("Hello ", "World");
		assertEquals("Hello World", result);
	}

}
