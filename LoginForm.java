public class LoginForm {
	private String name;
	private String code;
	
	private String a;
	private String b;
	
	public LoginForm(String expectedUsername, String expectedPassword) {
		name = expectedUsername;
		code = expectedPassword;
		
		a = null;
		b = null;
	}
	public void input(String text) {
		if(a == null) {
			a = text;
		}
		else if(a != null && b == null) {
			b = text;
		}
	}
	public void click(String button) {
		if(button == "Submit") {
			isLoggedIn();
		}
		if(button == "Reset") {
			a = null;
			b = null;
		}
	}
	public boolean isLoggedIn() {	
		if(a == name && b == code) {
			return true;
		}
		else {
			a = null;
			b = null;
			return false;
		}
	}
}