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
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
		driver.manage().window().maximize();
	}

	@Test
	public void Iamneo() throws InterruptedException{
	
		driver.get("http://www.flipkart.com");
        Thread.sleep(1000);
	}
	
	@Test
	public void NextPage() throws InterruptedException {
		//String str="abcde@gmail.com";
		WebElement signin = driver.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div.css-1dbjc4n.r-13awgt0.r-1iqfa7g.r-60vfwk > div > div._2NhoPJ > header > div._2msBFL > div:nth-child(2) > div > div > div > a"));
		WebElement emailField = driver.findElement(By.cssSelector("#container > div > div._2dSUjN > div > div._36HLxm.col.col-3-5 > div > form > div.IiD88i._351hSN > input"));
		emailField.sendKeys("abcde@gmail.com");
		
		WebElement requestButton = driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1k3JO2 > button"));
		requestButton.click();
        

	}



	/*@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}*/

}
