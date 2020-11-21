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
        } 
        else {
         System.out.println("Given Name is not valid.");
        }
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRegistration user = new UserRegistration();
		user.First_and_Last_Name();
	}

}