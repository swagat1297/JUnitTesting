package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegistrationMoodAnalyzerTest {
	@Test
	public void ValidfirstName() {
		UserRegistrationMoodAnalyzer test = new UserRegistrationMoodAnalyzer();
		boolean output = test.CheckFirstName();
		assertEquals(true, output);
	}
	@Test
	public void ValidlasttName() {
		UserRegistrationMoodAnalyzer test = new UserRegistrationMoodAnalyzer();
		boolean output = test.CheckLastName();
		assertEquals(true, output);
	}
	@Test
	public void ValidmobileNumber() {
		UserRegistrationMoodAnalyzer test = new UserRegistrationMoodAnalyzer();
		boolean output = test.CheckMobileNumber();
		assertEquals(true, output);
	}
	@Test
	public void ValidEmail() {
		UserRegistrationMoodAnalyzer test = new UserRegistrationMoodAnalyzer();
		boolean output = test.CheckEmail();
		assertEquals(true, output);
	}

	@Test
	public void ValidPassword() {
		UserRegistrationMoodAnalyzer test = new UserRegistrationMoodAnalyzer();
		boolean output = test.CheckPassword();
		assertEquals(true, output);
	}

}
