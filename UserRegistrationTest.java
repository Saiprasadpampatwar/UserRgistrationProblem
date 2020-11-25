import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	
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
	}
}
