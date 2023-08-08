package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver=null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
		driver.manage().window().maximize();
	}

	@Test
	public void iamneo() throws InterruptedException{
	
		driver.get("http://www.flipkart.com");

	}

	@Test
	
	public void NextPage() throws InterruptedException {
		String str="abcde@gmail.com";
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
        login.sendKeys(str);
		Thread.sleep(1000);
		WebElement requestbtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
        requestbtn.click();
        

	}



	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
