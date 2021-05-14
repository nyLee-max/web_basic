package web_basic.jsp_12;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("skdus5673@gmail.com", "xmyxgtgznkdxsugt");
	}
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
	
}
