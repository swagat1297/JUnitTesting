package Testing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMoodAnalyzer {
	//to check valid first name//
		public boolean CheckFirstName() {
			String read = "[A-Z][a-z]{3,}";;
			String text = "Swagat";
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
			
		}
		//to check valid last name//
		public boolean CheckLastName() {
			String read = "[A-Z][a-z]{3,}";
			String text = "Bhattacharjee";
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
		}
		
		//to check valid email//
		public boolean CheckEmail() {
			String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
			String text = "Aha.sggh4@gmail.com";
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
			
			
			
		}
		//to check valid mobile number//
		public boolean CheckMobileNumber() {
			String read = "^[0-9]{2}[ ][0-9]{10}$";
			String text = "91 3747374475";
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
		}
		//check password with Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character//
		public boolean CheckPassword() {
			String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
			String text = "121Swaggy@";
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			return (result);
		}
		public void MoodAnalyser() {
			UserRegistrationMoodAnalyzer analyse = new UserRegistrationMoodAnalyzer();
			if(analyse.CheckFirstName() == true && analyse.CheckLastName() == true && analyse.CheckMobileNumber() == true && analyse.CheckPassword() == true) {
				System.out.println("HAPPY");
			}
			else
				System.out.println("SAD");
		}
			
}
