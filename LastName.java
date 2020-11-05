package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
	         //to check valid last name//
		public boolean CheckLastName(String lastName) {
			try{
				String read = "[A-Z][a-z]{3,}";
				String text = lastName;
			
				Pattern pattern = Pattern.compile(read);
				Matcher match = pattern.matcher(text);
			
				boolean result = match.matches();
				return (result);
			}
			catch(Exception e){
				return false;
			}
		}

}
