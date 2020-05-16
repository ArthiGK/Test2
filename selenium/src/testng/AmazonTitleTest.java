package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AmazonTitleTest {
	WebDriver driver;
	WebElement srchbox;
	String ET= "Amazon.com : ";
	String AT=null;
	String input="Shoes";
	
	@BeforeTest
	public void beforeTest() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:\\amazon.com");
	}


	@Test
	public void VerifyTitle() throws InterruptedException {

		srchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		srchbox.sendKeys(input);
		srchbox.sendKeys(Keys.RETURN);  
		//Concatanate "Amazon.com : " with the current search term
		ET=ET+input;
		System.out.println("Expected title is: " + ET);
		Thread.sleep(4000);
		AT=driver.getTitle();
		System.out.println("Actual title is: " + AT);
		Assert.assertEquals(AT, ET);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
