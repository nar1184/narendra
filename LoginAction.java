package page;
import test.TestCase;
//import test.LoginTestcase;

import page.LoginPage ;

public class LoginAction extends TestCase  {
	public void login(final String username, final String password) { 
	    LoginPage.getUserName(driver).sendKeys(username);
	    LoginPage.getPassword(driver).sendKeys(password);
	    LoginPage.getLoginButton(driver).click();
	  }  

}
