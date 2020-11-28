import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
/*
@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private String email;
    private boolean result;
    private UserRegistration userRegistration2;


    @Before
    public void initialize() {
        userRegistration2 = new UserRegistration();
    }

    public UserRegistrationTest(String email, boolean result) {
        this.email = email;
        this.result = result;
    }


    @Parameterized.Parameters
    public static Collection emailChecker() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},
                {"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
                {"abc-",false},{"abc@.com",false},{"abc@123gmail.a",false},{"abc123@.com",false},
                {"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*@gmail.com",false},{"abc@%*.com.com",false},
                {"abc..2002@.gmail.com",false},{"abc.@gmail.com",false},{"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}
        });
    }



    @Test
    public void testEmailsMultiple() {
        Assert.assertEquals(result, userRegistration2.emailValidation(email));
    }
*/
public class UserRegistrationTest{
    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenNullFirstName() throws UserRegistrationException {

        try {
            boolean result = userRegistration.validateFirstName.validateUser(null);
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyFirstName() throws UserRegistrationException {

        try {
            boolean result = userRegistration.validateFirstName.validateUser("");
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY,e.type);
        }
    }

    @Test
    public void givenNullLastName() throws UserRegistrationException {

        try {
            boolean result = userRegistration.validateLastName.validateUser(null);
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL,e.type);
        }
    }

    @Test
    public void givenEmptyLastName() throws UserRegistrationException {

        try {
            boolean result = userRegistration.validateLastName.validateUser("");
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY,e.type);
        }
    }

    @Test
    public void givenNullEmail() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validateEmail.validateUser(null);
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL,e.type);
        }

    }

    @Test
    public void givenEmptyEmail() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validateEmail.validateUser("");
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY,e.type);
        }

    }

    @Test
    public void givenNullMobile() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validateMobile.validateUser(null);
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL,e.type);
        }

    }

    @Test
    public void givenEmptyMobile() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validateMobile.validateUser("");
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY,e.type);
        }

    }

    @Test
    public void givenNullPassword() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validatePassword.validateUser(null);
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_NULL,e.type);
        }

    }

    @Test
    public void givenEmptyPassword() throws UserRegistrationException {
        try {
            boolean result = userRegistration.validatePassword.validateUser("");
        }catch (UserRegistrationException e){
            System.out.println(e.type+" will give message  "+ e.getMessage());
            Assert.assertEquals(UserRegistrationException.ExceptionType.GIVEN_EMPTY,e.type);
        }

    }

    @Test
    public void testFirstName_returnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateFirstName.validateUser("Sai");
        Assert.assertTrue(result);

    }

    @Test
    public void testFirstName_returnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validateFirstName.validateUser("sAi");
        Assert.assertFalse(result);

    }
    @Test
    public void testLastName_returnTrue() throws UserRegistrationException{
        boolean result = userRegistration.validateLastName.validateUser("Prasad");
        Assert.assertTrue(result);

    }

    @Test
    public void testLastName_returnFalse() throws UserRegistrationException{
        boolean result = userRegistration.validateLastName.validateUser("pRasad");
        Assert.assertFalse(result);

    }

    @Test
    public void testEmail_returnTrue() throws UserRegistrationException{
        boolean result = userRegistration.validateEmail.validateUser("Prasad@gmail.com");
        Assert.assertTrue(result);

    }

    @Test
    public void testEmail_returnFalse() throws UserRegistrationException{
        boolean result = userRegistration.validateEmail.validateUser("abc@.com");
        Assert.assertFalse(result);

    }

    @Test
    public void testMobile_returnTrue() throws UserRegistrationException{
        boolean result = userRegistration.validateMobile.validateUser("91 8983100055");
        Assert.assertTrue(result);

    }

    @Test
    public void testMobile_returnFalse() throws UserRegistrationException{
        boolean result = userRegistration.validateMobile.validateUser("8983100055");
        Assert.assertFalse(result);

    }

    @Test
    public void testPassword_returnTrue() throws UserRegistrationException{
        boolean result = userRegistration.validatePassword.validateUser("Sai@12345");
        Assert.assertTrue(result);

    }

    @Test
    public void testPassword_returnFalse() throws UserRegistrationException{
        boolean result = userRegistration.validatePassword.validateUser("sa@ipbdb12");
        Assert.assertFalse(result);

    }

    @Test
    public void givenNullMassage() throws UserRegistrationException {
        String mood = userRegistration.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenEmptyMassage() throws UserRegistrationException {
        String mood = userRegistration.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
}
