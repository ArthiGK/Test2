package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public WebElement ele = null;

	public static void main(String[] args) throws InterruptedException {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://bestwestern.com");
		Thread.sleep(2000);
		WebElement checkin = driver.findElement(By.id("checkin"));
		checkin.click();
		driver.findElement(By.xpath("//span[contains(text(), 'Next month, ')]")).click();
		
		
		DatePicker dp = new DatePicker();
		dp.SelectDatePick(driver, 1, 7, "July 2020");

	}



	public void SelectDatePick(WebDriver driver,int rno, int colno,String month)
	{
		List <WebElement> Rows = driver.findElements(By.xpath("//table[@aria-label='"+month+"']/tbody/tr"));
		int totalRows = Rows.size();
		System.out.println(" Total rows : "+totalRows);

		//count columns
		List <WebElement> Columns = driver.findElements(By.xpath("//table[@aria-label='"+month+"']/tbody/tr[1]/td"));
		int totalColumns = Columns.size();
		System.out.println(" Total Columns : "+totalColumns);

		WebElement dataCell = driver.findElement(By.xpath("//table[@aria-label='"+month+"']/tbody/tr["+rno+"]/td["+colno+"]"));
		System.out.println(dataCell.getText());
		dataCell.click();
	}




}


