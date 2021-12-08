package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2b {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() ='Phone']")).click();
		driver.findElement(By.xpath("//input[@name = 'phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name = 'phoneCountryCode']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("4567890123");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		String leadId = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).getText();
		System.out.println("Lead ID is = "+leadId);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		String errorText = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		//String text1 = "No records to display";
		if (errorText.equalsIgnoreCase("No records to display"))
		{
			System.out.println("No Record is dispalyed is matching");
		}
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		//driver.quit();
	}

}
