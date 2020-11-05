package Testing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	//check password with Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character//
		public boolean CheckPassword(String Password) {
			try{
				String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
				String text = Password;
			
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
