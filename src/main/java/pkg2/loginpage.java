package pkg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {
	
	 WebDriver driver;
	    WebDriverWait wait;

	    

	    @FindBy(linkText = "Login / Signup")
	    WebElement login;

	    

	    @FindBy(xpath = "//*[@id=\"ulogin\"]")
	    WebElement email;

	    @FindBy(xpath = "//*[@id=\"upass\"]")
	    WebElement password;

	    @FindBy(xpath = "//*[@id=\"sub_logbtn\"]")
	    WebElement loginbutton;

	    

	    public loginpage(WebDriver driver) {

	        this.driver = driver;

	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        PageFactory.initElements(driver, this);
	    }

	    

	    public void openlogin() {

	        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	    }

	    

	    public void login(String useremail, String pass) {

	        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(useremail);

	        password.sendKeys(pass);

	        loginbutton.click();
	    }
	}
		
		
		





