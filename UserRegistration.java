import java.util.*;
public class UserRegistration {

	static Scanner sc = new Scanner(System.in);
	
	public void First_and_Last_Name()
	{
		System.out.println("Welcome to User Registration");
        System.out.println("Enter your first name: ");
        String fname = sc.next();
        System.out.println("Enter your last name: ");
        String lname = sc.next();
        String regex = "[A-Z]{1}[a-zA-Z]{2,}";
        boolean result = (fname.matches(regex) && lname.matches(regex));
        if(result) {
        	System.out.println("Given Name is valid.");
        	EmailValidation();
        } 
        else {
         System.out.println("Given Name is not valid.");
        }
        
	}
	
	public void EmailValidation() {
		System.out.println("Enter your Email: ");
        String email = sc.next();
        String regex = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+((?:\\.[a-z]{2,}){0,1}$)";
        boolean result = (email.matches(regex) );
        if(result) {
        	System.out.println("Given email is valid.");
        } 
        else {
         System.out.println("Given email is not valid.");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRegistration user = new UserRegistration();
		user.First_and_Last_Name();
	}

}