import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
		assertEquals(result, userRegistration2.emailValidation(email));
	}
	
	/*
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void testFirstName_returnTrue() {
		boolean result = userRegistration.firstName("Sai");
		assertTrue(result);
		
	}
	
	@Test
	public void testFirstName_returnFalse() {
		boolean result = userRegistration.firstName("sAi");
		assertFalse(result);
		
	}
	
	@Test
	public void testLastName_returnTrue() {
		boolean result = userRegistration.lastName("Prasad");
		assertTrue(result);
		
	}
	
	@Test
	public void testLastName_returnFalse() {
		boolean result = userRegistration.lastName("pRasad");
		assertFalse(result);
		
	}
	
	@Test
	public void testEmail_returnTrue() {
		boolean result = userRegistration.emailValidation("Prasad@gmail.com");
		assertTrue(result);
		
	}
	
	@Test
	public void testEmail_returnFalse() {
		boolean result = userRegistration.emailValidation("abc@.com");
		assertFalse(result);
		
	}
	
	@Test
	public void testMobile_returnTrue() {
		boolean result = userRegistration.mobileValidation("91 8983100055");
		assertTrue(result);
		
	}
	
	@Test
	public void testMobile_returnFalse() {
		boolean result = userRegistration.mobileValidation("8983100055");
		assertFalse(result);
		
	}
	
	@Test
	public void testPassword_returnTrue() {
		boolean result = userRegistration.passWordRule4("Sai@12345");
		assertTrue(result);
		
	}
	
	@Test
	public void testPassword_returnFalse() {
		boolean result = userRegistration.passWordRule4("sa@ipbdb12");
		assertFalse(result);
		
	}
	
	@Test 
	public void Given_Message_When_Sad_Should_Return_Sad() {
		String mood = userRegistration.analyseMood("This is a Sad Message");
		assertEquals("SAD", mood);
	}

	@Test 
	public void Given_Message_When_Happy_Should_Return_Happy() {
		String mood = userRegistration.analyseMood("This is a Happy Message");
		assertEquals("HAPPY", mood);
	}*/
}
