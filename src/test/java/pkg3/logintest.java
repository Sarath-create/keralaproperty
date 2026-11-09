package pkg3;

import org.testng.annotations.Test;

import baseone.baseone;
import pkg2.loginpage;
public class logintest extends baseone {
	
	 @Test
	    public void loginTest() {

	        loginpage ob = new loginpage(driver);

	        

	        ob.openlogin();

	        

	        ob.login(
	            "sarath1223@gmail.com",
	            "Test@123"
	        );
	    }

}
