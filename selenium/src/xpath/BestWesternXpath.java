package xpath;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class BestWesternXpath {

	WebDriver driver=null;
	WebElement dest_field;

	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bestwestern.com/en_US.html");
		driver.manage().window().maximize();
	}

	public void checkDefaultOptionsDisplayed() throws InterruptedException{

		dest_field= driver.findElement(By.xpath("//input[@id='destination-input']"));
		dest_field.click();
		Thread.sleep(3000);

		List <WebElement> defaultsug = driver.findElements(By.xpath("//ul[@id='default-suggestions']/li"));

		for(WebElement s : defaultsug)
		{
			String str=s.getText();
			System.out.println(s.getText());


			if(str.equals("CURRENT LOCATION"))
			{
				System.out.println("Current location is displayed");
			}
			if(str.equals("Recent Searches"))
			{
				System.out.println(("Recent searches is displayed"));
			}
		}
	}


	public void testSuggestionsDisplayed() throws InterruptedException
	{
		dest_field= driver.findElement(By.xpath("//input[@id='destination-input']"));
		dest_field.click();
		dest_field.sendKeys("Am");
		Thread.sleep(3000); //Very important
		List<WebElement> list= driver.findElements(By.xpath("//ul[@id='google-suggestions']/li"));
		System.out.println("Size of list is " + list.size());
		for(WebElement s : list)
		{
			String str=s.getText();
			System.out.println(s.getText());
			if(str.contains("AM"))	
			{
				System.out.println(s.getText() + " contains " + "AM");
			}

			else
			{
				System.out.println(s.getText() + " does not contain " + "AM");
			}
		}
		
		driver.findElement(By.xpath("//ul[@id='google-suggestions']/li[4]")).click();

	}

public void verifyTextboxisRed()
{
     String errorColor="rgb(255, 0, 0)";
     //Click on any Find my hotel
     WebElement button=driver.findElement(By.xpath("//button[@id='btn-modify-stay-update']"));
     button.click();
     dest_field= driver.findElement(By.xpath("//input[@id='destination-input']"));
     String colorValue = dest_field.getCssValue("border-color");
   //Use Color class to convert the value from rgba() to Hex code and store in a variable
     //String hexColorValue = Color.fromString(colorValue).asHex();
     
     System.out.println(colorValue);
    // System.out.println(hexColorValue);
     
     
     
     if(errorColor.contentEquals(colorValue))
     {
    	 System.out.println("Text box turned red");
     }

  
}

public void invalidEntry() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='destination-input']")).sendKeys("dfjdfhdfhdf");
	Thread.sleep(5000);
	WebElement error = driver.findElement(By.xpath("//div[@id='bw-destination-wrapper']//li[contains(text(),'No places found for the term')]"));
		System.out.println(error.getText());
		//System.out.println("Error messge is displayed");
	}

	public static void main(String[] args) throws InterruptedException {
		BestWesternXpath obj = new BestWesternXpath();
		obj.setUpTest();
		//obj.checkDefaultOptionsDisplayed();
		//obj.testSuggestionsDisplayed();
		//obj.clickRecentSearches();
		//obj.verifyTextboxisRed();
		obj.invalidEntry();


	}

}
