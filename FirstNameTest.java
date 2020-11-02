package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTest {

	@Test
	public void test() {
		FirstName test = new FirstName();
		boolean output = test.CheckFirstName("Anurag");
		assertEquals(true, output);
	}

}
