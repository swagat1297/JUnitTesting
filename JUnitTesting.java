import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTesting {

	@Test
	public void FirstNametest() {
		UserRegistration test = new UserRegistration();
		boolean output = test.CheckFirstName();
		assertEquals(true, output);
	}
	
	@Test
	public void LastNametest() {
		UserRegistration test = new UserRegistration();
		boolean output = test.CheckLastName();
		assertEquals(true, output);
	}
	
	@Test
	public void Emailtest() {
		UserRegistration test = new UserRegistration();
		boolean output = test.CheckEmail();
		assertEquals(true, output);
	}
	
	@Test
	public void MobileNumbertest() {
		UserRegistration test = new UserRegistration();
		boolean output = test.CheckMobileNumber();
		assertEquals(true, output);
	}
	@Test
	public void Passwordtest() {
		UserRegistration test = new UserRegistration();
		boolean output = test.CheckPassword();
		assertEquals(true, output);
	}

}
