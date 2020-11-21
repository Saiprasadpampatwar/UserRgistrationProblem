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
        	MobileValidation();
        } 
        else {
         System.out.println("Given email is not valid.");
        }
	}
	
	public void MobileValidation() {
		System.out.println("Enter your mobile number with country code space and number: ");
		sc.nextLine();
        String mobile = sc.nextLine();   
        String regex = "([0-9]{2})[ ]{1}[7-9][0-9]{9}";
        boolean result = (mobile.matches(regex) );
        if(result) {
        	System.out.println("Given mobile is valid.");
        	PassWordRule1();
        } 
        else {
         System.out.println("Given mobile is not valid.");
        }
	}
	
	public void PassWordRule1() {
		System.out.println("Enter Password with minimum 8 characters: ");
        String password1 = sc.next();
        String regex = ".{8,}";
        boolean result = (password1.matches(regex) );
        if(result) {
        	System.out.println("Given password is valid.");
        	PassWordRule2();
        } 
        else {
         System.out.println("Given password is not valid.");
        }
	}
	
	public void PassWordRule2() {
		System.out.println("Enter Password with minimum 8 characters and atleast 1 upper case character: ");
        String password2 = sc.next();
        String regex = "([A-Z])?(.{7,})";
        boolean result = (password2.matches(regex) );
        if(result) {
        	System.out.println("Given password is valid.");
        } 
        else {
         System.out.println("Given password is not valid.");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserRegistration user = new UserRegistration();
		user.First_and_Last_Name();
	}

}