package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTesting {

	@Test
	public void test() {
		Password test = new Password();
		boolean output = test.CheckPassword("Anurag725@");
		assertEquals(true, output);
	}

}
