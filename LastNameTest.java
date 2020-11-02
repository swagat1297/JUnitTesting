package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastNameTest {

	@Test
	public void test() {
		LastName test = new LastName();
		boolean output = test.CheckLastName("Verma");
		assertEquals(true, output);
	}

}
