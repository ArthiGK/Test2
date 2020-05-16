package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arthi\\eclipse-workspace\\selenium\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		
		act.dragAndDrop(src, dest).perform();
	}
}
