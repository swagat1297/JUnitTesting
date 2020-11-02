package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailTesting {

	@Test
	public void test() {
		EmailAddress test = new EmailAddress();
		boolean output = test.CheckEmail("abc.12bc@yahoo.com");
		assertEquals(true, output);
	}

}
