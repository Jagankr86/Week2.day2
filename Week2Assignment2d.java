package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2d {

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
		driver.findElement(By.xpath("//span[text() ='Email']")).click();
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("jagankr@abc.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//a[@href = '/crmsfa/control/viewLead?partyId=10707\']")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text() ='Email']")).click();
		driver.findElement(By.xpath("//input[@name = 'emailAddress']")).sendKeys("jagankr@abc.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		String firstName1 = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
		String firstName2 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[2]")).getText();
		System.out.println("1st name 1 ="+firstName1);
		System.out.println("2nd name 1 ="+firstName2);
		if(firstName1.equals(firstName2))
		{
			System.out.println("String Value matching");
		}
		else
		{
			System.out.println("String value Not Matching");
		}
		String title1 = driver.getTitle();
		System.out.println("Title is "+title1);
		//driver.quit();
	}
}