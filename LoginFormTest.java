import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginFormTest {

	@Test
	public void testCorrectUsernameIncorrectPassword() {
		// Tests that a correct username + an incorrect password does not allow the user to log in
		LoginForm test = new LoginForm("Bob", "Flanders");
		test.input("Bob");
		test.input("Smith");
		test.click("Submit");
		assertEquals(false, test.isLoggedIn());
	}
	
	@Test
	public void testIncorrectUsernameCorrectPassword() {
		// Tests that an incorrect username + a correct password does not allow the user to log in
		LoginForm test = new LoginForm("Bob", "Flanders");
		test.input("John");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(false, test.isLoggedIn());
	}
	@Test
	public void testCorrectCredentialsFirstTry() {
		// Tests that providing correct username and password on first try allows the user to log in
		LoginForm test = new LoginForm("Bob", "Flanders");
		test.input("Bob");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(true, test.isLoggedIn());
	}
	
	@Test
	public void testIncorrectFirstCorrectSecond() {
		// Tests that the following steps allow the user to log in: 1) Provide incorrect credentials, 2) Submit 3) Provide correct credentials 4) Submit
		LoginForm test = new LoginForm("Bob", "Flanders");
		test.input("John");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(false, test.isLoggedIn());
		
		test.input("Bob");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(true, test.isLoggedIn());
	}
	
	@Test
	public void testCorrectFirstIncorrectSecond() { 
		// Tests that the user stays logged in after correct credentials are submitted, even if incorrect credentials are then submitted: 1) Provide correct credentials, 2) Submit 3) Provide incorrect credentials 4) Submit
		LoginForm test = new LoginForm("Bob", "Flanders");
		test.input("Bob");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(true, test.isLoggedIn());
		
		test.input("John");
		test.input("Flanders");
		test.click("Submit");
		assertEquals(true, test.isLoggedIn());
	}
}

