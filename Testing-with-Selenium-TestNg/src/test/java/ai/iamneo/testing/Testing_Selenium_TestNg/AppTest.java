package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void iamNeo() throws InterruptedException {
		
		driver.get("https://www.flipkart.com");

	}

	@Test
	// Moving to FACEBOOK
	public void NextPage() throws InterruptedException {
		
		driver.navigate().to("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendkeys("praveenryz@gmail.com");
	}

	@Test
	public void BackPage() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendkeys("praveenryz@gmail.com");
	}

	@Test
	// Current URL
	public void CurrentURL() throws InterruptedException {
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
}


	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}

