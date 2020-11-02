package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MobileNumberTesting {

	@Test
	public void test() {
		MobileNumber test = new MobileNumber();
		boolean output = test.CheckMobileNumber("91 5362718263");
		assertEquals(true, output);
	}

}
