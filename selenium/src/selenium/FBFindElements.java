package selenium;
import java.util.List;

import org.openqa.selenium.By;  
//import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FBFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\Downloads\\chromedriver_win32\\chromedriver.exe");  	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");

		driver.manage().window().maximize();

		//Enter firstname

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");

		//Select birthday by day,month and year dropdown
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select sday=new Select(day);
		sday.selectByValue("24");
		System.out.println(day.getAttribute("value"));

		WebElement month=driver.findElement(By.id("month"));
		Select smon = new Select(month);
		smon.selectByIndex(5);

		System.out.println(month.getAttribute("value"));


		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select syear=new Select(year);
		syear.selectByVisibleText("1988");
		System.out.println(year.getAttribute("value"));

		//Click on Female radio button
		driver.findElement(By.xpath("//input[@id='u_0_6']")).click();

		List  <WebElement> monthCount=smon.getOptions();
		int size=monthCount.size();

		for (int i=0;i<size;i++)
		{
			String svalue=monthCount.get(i).getText();
			System.out.println(svalue);
		}


		//Capture Entire Text Available under parent tag
		System.out.println(day.getText());
		System.out.println(month.getText());




	}

}
