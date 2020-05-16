package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		//Getting the driver path from eclipse location
		String projectpath=System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\ChromeDriver\\chromedriver.exe");  	
	
		 WebDriver driver=new ChromeDriver();
		    driver.get("http://facebook.com/");
		    
		    driver.manage().window().maximize();
		    
		    //Enter firstname
		  
		   driver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys("Test");
		   // driver.findElement(By.id("u_0_q")).sendKeys("Arthi");
		   // driver.findElement(By.name("firstname")).sendKeys("Arthi");
		    
		  //Select birthday by day,month and year dropdown
		    Select sel1=new Select(driver.findElement(By.name("birthday_day")));
		    sel1.selectByValue("24");
		    Select sel2=new Select(driver.findElement(By.name("birthday_month")));
		    sel2.selectByVisibleText("May");
		    Select sel3=new Select(driver.findElement(By.name("birthday_year")));
		    sel3.selectByIndex(6);
		    
		    //Click on Female radio button
		    driver.findElement(By.name("sex")).click();
		    
		    //Click on Signup
		    //driver.findElement(By.name("websubmit")).click();
		    
		    //Click on the link Create a page
		    driver.findElement(By.name("https://www.facebook.com/pages/create/?ref_type=registration_form")).click();
		    
		    //Click on back
		    //driver.navigate().back();

	}

}

