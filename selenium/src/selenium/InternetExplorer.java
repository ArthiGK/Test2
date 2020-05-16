package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\arthi\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(); 
		 // Launch Website  
        driver.navigate().to("http://www.google.com/");  
          
           //Maximize the browser  
          driver.manage().window().maximize();  
          // Click on the search text box and send value  
          driver.findElement(By.name("q")).sendKeys("java");  
                
             // Click on the search button  
          driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  

	}

}
