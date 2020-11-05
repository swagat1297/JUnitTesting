

import java.util.*;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runners.Parameterized;

public class EmailSample {
    private String Emails;
    private String Result;
    public void Test(String Emails, String Result) {
        this.Emails = Emails;
        this.Result = Result;
    }

    public static Collection input()
    {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc@yahoo.com", false},
                {"abc-100@yahoo.com", false},
                {"abc.100@yahoo.com", false},
                {"abc111@abc.com", false},
                {"abc-100@abc.net", false},
                {"abc.100@abc.com.au", false},
                {"abc@1.com", false},
                {"abc@gmail.com.com", false},
                {"abc+100@gmail.com", false},
        });
    }

    public void testEmailIds() {
    	EmailAddress validate = new EmailAddress();
        boolean email = (Boolean) null;
        try {
             email = validate.CheckEmail(Emails);
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input");
        }

    }
}