import java.util.Scanner;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public void isEmptyorNullString(String input) throws UserRegistrationException {
        try {
            if (input.length() == 0) {
                throw new UserRegistrationException( UserRegistrationException.ExceptionType.GIVEN_EMPTY, " Empty input not Allowed please Enter again");
            }
        }
        catch(NullPointerException e)
        {
            throw new UserRegistrationException( UserRegistrationException.ExceptionType.GIVEN_NULL, "Null not allowed please Enter again ");

        }
    }

    public boolean firstName(String fname) throws UserRegistrationException {
        isEmptyorNullString(fname);
        String regex = "[A-Z]{1}[a-zA-Z]{2,}";
        boolean result = (fname.matches(regex));
        if(result) {
            System.out.println("Given First Name is valid.");
        }
        else {
            System.out.println("Given First Name is not valid.");
        }
        return result;

    }

    public boolean lastName(String lname) throws UserRegistrationException {
        isEmptyorNullString(lname);
        String regex = "[A-Z]{1}[a-zA-Z]{2,}";
        boolean result = (lname.matches(regex));
        if(result) {
            System.out.println("Given Last Name is valid.");
        }
        else {
            System.out.println("Given Last Name is not valid.");
        }
        return result;

    }

    public boolean emailValidation(String email) throws UserRegistrationException {
        isEmptyorNullString(email);
        String regex = "^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+((?:\\.[a-z]{2,}){0,1}$)";
        boolean result = (email.matches(regex) );
        if(result) {
            System.out.println("Given email is valid.");
        }
        else {
            System.out.println("Given email is not valid.");
        }
        return result;
    }

    public boolean mobileValidation(String mobile) throws UserRegistrationException {
        isEmptyorNullString(mobile);
        String regex = "([0-9]{2})[ ]{1}[7-9][0-9]{9}";
        boolean result = (mobile.matches(regex) );
        if(result) {
            System.out.println("Given mobile is valid.");
        }
        else {
            System.out.println("Given mobile is not valid.");
        }
        return result;
    }

    public void passWordRule1() {
        System.out.println("Enter Password with minimum 8 characters: ");
        String password1 = sc.next();
        String regex = ".{8,}";
        boolean result = (password1.matches(regex) );
        if(result) {
            System.out.println("Given password is valid.");
            //PassWordRule2();
        }
        else {
            System.out.println("Given password is not valid.");
        }
    }

    public void passWordRule2() {
        System.out.println("Enter Password with minimum 8 characters and atleast 1 upper case character: ");
        String password2 = sc.next();
        String regex = "(?=.*[A-Z])(.{7,})";
        boolean result = (password2.matches(regex) );
        if(result) {
            System.out.println("Given password is valid.");
            //PassWordRule3();
        }
        else {
            System.out.println("Given password is not valid.");
        }
    }

    public void passWordRule3() {
        System.out.println("Enter Password with minimum 8 characters and atleast 1 upper case character: ");
        String password3 = sc.next();
        String regex = "(?=.*[0-9])(?=.*[A-Z])(.{6,})";
        boolean result = (password3.matches(regex) );
        if(result) {
            System.out.println("Given password is valid.");
            //PassWordRule4();
        }
        else {
            System.out.println("Given password is not valid.");
        }
    }

    public boolean passWordRule4(String password4) throws UserRegistrationException {
        isEmptyorNullString(password4);
        String regex = "(?=.*[@*&^%#-*+!])(?=.*[0-9])(?=.*[A-Z])(.{6,})";
        boolean result = (password4.matches(regex) );
        if(result) {
            System.out.println("Given password is valid.");
        }
        else {
            System.out.println("Given password is not valid.");
        }
        return result;
    }

    public String analyseMood(String message) throws UserRegistrationException {
        isEmptyorNullString(message);
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }

}
