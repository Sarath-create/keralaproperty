package pkg2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registrationpage {
	
	  WebDriver driver;
	    WebDriverWait wait;

	    

	    @FindBy(linkText = "Login / Signup")
	    WebElement login;

	  

	    @FindBy(partialLinkText = "New user")
	    WebElement newuser;

	    

	    @FindBy(xpath = "//select")
	    WebElement role;

	    @FindBy(id = "utitle")
	    WebElement name;

	    @FindBy(id = "umail")
	    WebElement email;

	    @FindBy(id = "memberpass")
	    WebElement pass;

	    @FindBy(id = "repass")
	    WebElement cpass;

	    @FindBy(id = "umobile")
	    WebElement phone;

	    @FindBy(xpath = "//button[normalize-space()='Create Account'] | //input[@value='Create Account']")
	    WebElement createaccount;

	   
	    @FindBy(partialLinkText = "Already Registered")
	    WebElement alreadyregistered;

	  

	    public registrationpage(WebDriver driver) {

	        this.driver = driver;

	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        PageFactory.initElements(driver, this);
	    }


	    public void link() {

	        wait.until(ExpectedConditions.elementToBeClickable(login)).click();

	        wait.until(ExpectedConditions.elementToBeClickable(newuser)).click();

	        wait.until(ExpectedConditions.visibilityOf(name));
	    }

	    

	    public void register(String userrole, String username, String useremail,
	                         String password, String confirmpassword, String mobile) {

	        Select s = new Select(role);

	        s.selectByVisibleText(userrole);

	        name.sendKeys(username);

	        email.sendKeys(useremail);

	        pass.sendKeys(password);

	        cpass.sendKeys(confirmpassword);

	        phone.sendKeys(mobile);

	        createaccount.click();
	    }

	    

	    public void backtologin() {

	        wait.until(ExpectedConditions.elementToBeClickable(alreadyregistered)).click();
	    }
	}


