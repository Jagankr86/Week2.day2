package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment2c {

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
		driver.findElement(By.xpath("//span[text() ='Name and ID']")).click();
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Jagannathan");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		String updatedCompanyName = "CMS";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedCompanyName);
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
		String companyName1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName1);
		if(companyName1.contains(updatedCompanyName))
		{
			System.out.println("Company Name Matching");
		}
		String title1 = driver.getTitle();
		System.out.println("Title is "+title1);
		//driver.quit();
	}
}