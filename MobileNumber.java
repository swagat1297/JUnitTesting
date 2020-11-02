package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	//to check valid mobile number//
		public boolean CheckMobileNumber(String Number) {
			String read = "^[0-9]{2}[ ][0-9]{10}$";
			String text = Number;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
		}

}
