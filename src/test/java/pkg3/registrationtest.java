package pkg3;



import org.testng.annotations.Test;

import baseone.baseone;
import pkg2.registrationpage;

public class registrationtest extends baseone {
	
	
	 @Test
	 
	    public void registration() {

	        registrationpage ob = new registrationpage(driver);

	        

	        ob.link();

	        ob.register(
	            "Property Owner",
	            "zeck",
	            "sarath122573@gmail.com",
	            "Test@123",
	            "Test@123",
	            "9876543210"
	        );
	    }

}
