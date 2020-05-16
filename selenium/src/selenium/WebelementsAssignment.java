package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebElement fname=null;
		WebElement lname=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\eclipse-workspace\\inetbankingV1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();	
		String ET = "Facebook - Log In or Sign Up";
		String AT = driver.getTitle();
		if(ET.equals(AT))
		{
		System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}

List <WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		
		for(WebElement a : alllinks)
		{
			System.out.println(a.getText());
		}
	}

}
