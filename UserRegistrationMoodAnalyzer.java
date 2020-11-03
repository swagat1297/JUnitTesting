package Testing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMoodAnalyzer {
	//to check valid first name//
		public boolean CheckFirstName() {
			Scanner scan = new Scanner(System.in);
			String read = "[A-Z][a-z]{3,}";
			
			System.out.println("Enter the first name:");
			String firstName = scan.next();
			String text = firstName;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			scan.close();
			return (result);
			
		}
		//to check valid last name//
		public boolean CheckLastName() {
			Scanner scan = new Scanner(System.in);
			String read = "[A-Z][a-z]{3,}";
			
			System.out.println("Enter the Last name:");
			String lastName = scan.next();
			String text = lastName;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			scan.close();
			return (result);
		}
		
		//to check valid email//
		public boolean CheckEmail() {
			Scanner scan = new Scanner(System.in);
			String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
			
			System.out.println("Enter the Email:");
			String Email = scan.next();
			String text = Email;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			scan.close();
			return (result);
			
			
			
		}
		//to check valid mobile number//
		public boolean CheckMobileNumber() {
			Scanner scan = new Scanner(System.in);
			String read = "^[0-9]{2}[ ][0-9]{10}$";
			
			System.out.println("Enter the PhoneNumber:");
			String Number = scan.next();
			String text = Number;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			scan.close();
			return (result);
		}
		//check password with Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character//
		public boolean CheckPassword() {
			Scanner scan = new Scanner(System.in);
			String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
			
			System.out.println("Enter the Password:");
			String Password = scan.next();
			String text = Password;
			
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
			
			boolean result = match.matches();
			scan.close();
			return (result);
		}
		public void MoodAnalyser() {
			mood analyse = new mood();
			if(analyse.CheckFirstName() == true && analyse.CheckLastName() == true && analyse.CheckMobileNumber() == true && analyse.CheckPassword() == true) {
				System.out.println("HAPPY");
			}
			else
				System.out.println("SAD");
		}
			
}
