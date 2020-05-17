package selenium;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  
public class selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
   driver.get("http://newtours.demoaut.com/");  
     
    //Maximize the browser  
    // driver.manage().window().maximize();  
   //WebElement username=driver.findElement(By.name("userName"));
   
   driver.findElement(By.name("userName")).sendKeys("mercury");
   driver.findElement(By.name("password")).sendKeys("mercury");
   driver.findElement(By.name("login")).click();
   String exptitle = "Find a Flight: Mercury Tours:";
   String acttitle = driver.getTitle();
   if(exptitle.equals(acttitle))
   {
    System.out.println("Test passed");
   }
   
   else
   {
	   System.out.println("Test failed");
   }
  System.out.println("Test for github");
  System.out.println("Checking changes in purchase branch");
	}
}

