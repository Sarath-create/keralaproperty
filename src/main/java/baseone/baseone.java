package baseone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseone {
	
	
    public WebDriver driver;

    @BeforeTest
    public void start() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://keralaproperty.in/");
    }

	


}
