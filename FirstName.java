package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	
	public boolean CheckFirstName(String firstName) {
		String read = "[A-Z][a-z]{3,}";
		String text = firstName;
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(text);
		boolean result = match.matches();
		return (result);
	}
}
