package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
	//to check valid email//
		public boolean CheckEmail(String Email) {
			try{
				String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
				String text = Email;
			
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
