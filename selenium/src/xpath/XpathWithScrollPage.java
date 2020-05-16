package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathWithScrollPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		 driver.manage().window().maximize();
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys("admin");
		
		//Click on the Cookies pop-up
		WebElement button = driver.findElement(By.xpath("//button[text()='Got it!']"));		
		button.click();
	
		//Click on Continue with google
		//driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		
		
		//Click on Create a new account
		driver.findElement(By.xpath("//a[@href='/start' and @rel='external']")).click();
		//driver.findElement(By.linkText("Create a new account")).click();
		
		//Click on Continue button
		//driver.findElement(By.xpath("//button[@type='submit'and@class='button form-button is-primary']")).click();
		
		//Go back to previous screen 
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//Scroll down
		
		 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		  
		 Thread.sleep(3000);
		//Click on the link "Back to wordpress.com"
		WebElement link=driver.findElement(By.xpath("//a[contains(@href,'wordpress.com') and contains(@class,'logged-out-form')]"));
		link.click();
		System.out.println(link.getText());
	}

}
